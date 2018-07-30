package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMatrixZero {

	public static void main(String[] args) {
		int[][] matrix = {{1, 0}, {1, 1}};
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,0));
		ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(1,1));
		ArrayList<ArrayList<Integer>> li=new ArrayList<>();
		li.add(list);
		li.add(list2);
		//setZeroes(li);
		set(matrix);
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix.length; j++) {
//				System.out.print(matrix[i][j]+" ");
//			}
//			System.out.println();
//		}
	}
	public static void set(int[][] matrix) {
		int col0 = 1, rows = matrix.length, cols = matrix[0].length;

		for (int i = 0; i < rows; i++) {
			if (matrix[i][0] == 0)
				col0 = 0;
			for (int j = 1; j < cols; j++)
				if (matrix[i][j] == 0)
					matrix[i][0] = matrix[0][j] = 0;
		}

		for (int i = rows - 1; i >= 0; i--) {
			for (int j = cols - 1; j >= 1; j--)
				if (matrix[i][0] == 0 || matrix[0][j] == 0)
					matrix[i][j] = 0;
			if (col0 == 0)
				matrix[i][0] = 0;
		}
	}

    public static void setZeroes(ArrayList<ArrayList<Integer>> a) {
        boolean col0=false;
        for(int i=0;i<a.size();i++){
            if(a.get(i).get(0)==0)
            col0=true;
            for(int j=1;j<a.get(i).size();j++){
                if(a.get(i).get(j)==0){
                    a.get(i).set(0,0);
                    a.get(0).set(j,0);
                }
            }
        }
        
        for(int i=a.size()-1;i>=0;i--){
            for(int j=a.get(i).size()-1;j>=0;j--){
                if(a.get(0).get(j)==0 || a.get(i).get(0)==0)
                a.get(i).set(j,0);
            }
            if(col0)
            a.get(i).set(0,0);
        }
    }

}
