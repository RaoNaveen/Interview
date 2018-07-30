package Array;

class Model{
	int x;int y;
	Model(int x,int y){
		this.x=x;
		this.y=y;
	}
}

public class MakeARow0andColumn0 {

	public static void main(String[] args) {
		int arr[][] =  {{1, 0, 1, 0}, 
						{1, 0, 1, 0},
						{0, 0, 0, 0}};
		makeMatrixZero(arr);
	}

	private static void makeMatrixZero(int[][] arr) {
	boolean rowFlag=false;
	boolean colFlag=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][0]==1)
					colFlag=true;
				if(arr[0][j]==1)
					rowFlag=true;
				if(arr[i][j]==1) {
					arr[0][j]=1;
					arr[i][0]=1;
				}
			}
		}
		
		for(int i=1;i<arr.length;i++) {
			for(int j=1;j<arr[0].length;j++) {
				if(arr[0][j]==1 || arr[i][0]==1) {
					arr[i][j]=1;
				}
			}
		}
		
		if(rowFlag) {
			for(int i=0;i<arr[0].length;i++) {
				arr[0][i]=1;
			}
		}
		if(colFlag) {
			for(int i=0;i<arr.length;i++) {
				arr[i][0]=1;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}
