package math;

public class GCD {
	public static void main(String[] args) {
		System.out.println(findgcd(60, 36));
	}

	private static int findgcd(int A, int B) {
		while (A > 0) {
			int temp=A;
			A = B % A;
			B=temp;
		}
		return B;
	}
}
