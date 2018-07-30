package binarySearch;

public class PowerFunction {

	public static void main(String[] args) {
		System.out.println(pow(-1, 1, 20));
	}
	public static int pow(int x, int y, int p) {
		if(x==0 && y==0)
			return 0;
		int res = 1;

		// Update x if it is more
		// than or equal to p
		x = x % p;
		while (y > 0) {
			// If y is odd, multiply x
			// with result
			int temp;
			if ((y & 1) == 1) {
				 temp=res*x;
				 if(temp<0)
					 temp=p-Math.abs(temp);
				res = (temp) % p;
			}

			// y must be even now
			// y = y / 2
			y = y >> 1;
			x = (x * x) % p;
		}
		return res;
	}
}
