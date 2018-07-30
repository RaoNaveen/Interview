package oye;

public class RatInMaze {
	int N = 4;
	public static void main(String[] args) {
		RatInMaze rat = new RatInMaze();
		int maze[][] = {{0, 0, 0, 0}, 
						{0, -1, 0, 0}, 
						{0, -1, -1, 0},
						{-1, 0, 0, 0}};
		rat.solveMaze(maze);
	}

	private void solveMaze(int[][] maze) {
		int sol[][] = new int[N][N];
		if (solveMazeUtil(maze, 0, 0, sol) == true) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(sol[i][j] + " ");
				}
				System.out.println();
			}
		} else {
			System.out.println("No Solution Present");
		}
	}

	private boolean solveMazeUtil(int[][] maze, int i, int j, int[][] sol) {
		if (i == N - 1 && j == N - 1) {
			sol[i][j] = 1;
			return true;
		}
		if (isSafe(maze, i, j)) {
			sol[i][j] = 1;
			if (solveMazeUtil(maze, i + 1, j, sol))
				return true;
			if (solveMazeUtil(maze, i, j + 1, sol))
				return true;
			sol[i][j] = 0;
			//return false;
		}
		return false;
	}

	private boolean isSafe(int[][] maze, int i, int j) {
		if (i >= 0 && i < N && j >= 0 && j < N && maze[i][j] == 0)
			return true;
		return false;
	}
}
