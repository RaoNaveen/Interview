package math;

public class PrimeSum {

	public static void main(String[] args) {
		// for(int i:primesum(10))
		// System.out.println(i);
		// for(String i:fizzBuzz(3))
		// System.out.println(i);
		System.out.println(reverse(-1234567891));
	}

	public static int reverse(int A) {
		boolean negativeFlag = false;
		if (A < 0) {
			negativeFlag = true;
			A = -A;
		}

		int prev_rev_num = 0, rev_num = 0;
		while (A != 0) {
			int curr_digit = A % 10;

			rev_num = (rev_num * 10) + curr_digit;

			if ((rev_num - curr_digit) / 10 != prev_rev_num) {
				return 0;
			}

			prev_rev_num = rev_num;
			A = A / 10;
		}

		return (negativeFlag == true) ? -rev_num : rev_num;
	}

	public static String[] fizzBuzz(int A) {
		String str[] = new String[A];
		for (int i = 1; i <= A; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				str[i - 1] = "FizzBuzz";
			else if (i % 3 == 0)
				str[i - 1] = "Fizz";
			else if (i % 5 == 0)
				str[i - 1] = "Buzz";
			else
				str[i - 1] = "" + i;
		}
		return str;
	}

	public static int[] primesum(int A) {
		int arr[] = new int[2];
		int first = 2;
		int second = A - first;
		while (first <= second) {
			second = A - first;
			if (isPrime(first) && isPrime(second)) {
				arr[0] = first;
				arr[1] = second;
				return arr;
			}
			first++;
		}
		return arr;
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
