package test;

public class SolveSudoku {
	static int grid[][] = {{3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}};
	public static void main(String[] args) {
		SolveSudoku sudoku=new SolveSudoku();
		if(sudoku.solveSudoku(grid)==true)
			printSolution();
		else
			System.out.println("No Solution Exists");
	}

	private boolean solveSudoku(int[][] grid) {
		int row=0,col = 0;
		boolean flag=false;
		for(row=0;row<grid.length;row++) {
			for(col=0;col<grid.length;col++) {
				if(grid[row][col]==0) {
					flag=true;
					break;
				}
			}
			if(flag)
				break;
		}
		if(!flag)
			return true;
		int num;
		for(num=1;num<=9;num++) {
			if(isSafe(grid,row,col,num)) {
				grid[row][col]=num;
			if(solveSudoku(grid))
				return true;
			grid[row][col]=0;
			}
		}
		return false;
	}

	private boolean isSafe(int[][] grid, int row, int col,int num) {
		return ((!usedInRow(grid,row,num) && !usedInCol(grid,col,num) && !usedInMatrix(grid,row-row%3,col-col%3,num)));
	}

	private boolean usedInMatrix(int[][] grid, int row, int col, int num) {
		for(int i=row;i<row+3;i++) {
			for(int j=col;j<col+3;j++) {
				if(grid[i][j]==num)
					return true;
			}
		}
		return false;
	}

	private boolean usedInCol(int[][] grid, int col, int num) {
		for(int row=0;row<9;row++)
			if(grid[row][col]==num)
				return true;
		return false;
	}

	private boolean usedInRow(int[][] grid, int row, int num) {
		for(int col=0;col<9;col++) {
			if(grid[row][col]==num)
				return true;
		}
		return false;
	}

	
	private static void printSolution() {
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid.length;j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
	}
}
