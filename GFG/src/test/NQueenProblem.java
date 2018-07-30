package test;

public class NQueenProblem {
	int N = 4;
	static int board[][] = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0},
			{0, 0, 0, 0}};
	public static void main(String[] args) {
		NQueenProblem nQueenProblem = new NQueenProblem();
		if (nQueenProblem.solveNQueen(board, 0) == true)
			nQueenProblem.printSolution(board);
		else {
			System.out.println("Solution Not Exist");
		}
	}
	private void printSolution(int[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	private boolean solveNQueen(int[][] board, int col) {
		if (col >= 4)
			return true;
		for (int row = 0; row < N; row++) {
			if (isSafe(board, row, col)) {
				board[row][col] = 1;
				if (solveNQueen(board, col + 1))
					return true;
				board[row][col] = 0;
			}
		}
		return false;
	}
	private boolean isSafe(int[][] board, int row, int col) {
		// Same Row
		for (int i = 0; i < col; i++)
			if (board[row][i] == 1)
				return false;
		//diagonal
		for (int i = row, j = col; i >=0 && j >=0; i--, j--) {
			if (board[i][j] == 1)
				return false;
		}
		//lower backward diagonal
		for (int i = row, j = col; i < N && j >= 0; i++, j--)
			if (board[i][j] == 1)
				return false;

		return true;
	}
}