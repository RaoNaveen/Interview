package math;

public class TrailingZeroInFactorial {

	public static void main(String[] args) {
		int n = 28;
		System.out.println(countTrailingZero(n));
	}

	private static int countTrailingZero(int n) {
		int count = 0;
		for(int i=5;n/i>=1;i=i*5) 
			count+=n/i;
		return count;
	}
}