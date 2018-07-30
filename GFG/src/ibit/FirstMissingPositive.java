package ibit;

public class FirstMissingPositive {

	public static void main(String[] args) {
		//int arr[] = {-3};
		int arr[]= {-3};
		System.out.println(firstMissingPositive(arr));
	}

	public static int firstMissingPositive(int[] A) {
        int j = A.length - 1;
        int i = 0;
        while (i <= j) {
            if (A[i] > 0)
                i++;
            else {
                int temp = A[j];
                A[j] = A[i];
                A[i] = temp;
                j--;
            }
        }
        for (int k = 0; k < i; k++) {
            if (Math.abs(A[k])-1 < i) {
                A[Math.abs(A[k])-1] = -A[Math.abs(A[k])-1];
            }
        }
        for (int z = 0; z < i; z++) {
            if (A[z] > 0)
                return z+1;
        }
        return i+1;
    }

}
