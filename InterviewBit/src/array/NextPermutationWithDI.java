package array;

public class NextPermutationWithDI {

	public static void main(String[] args) {
		String str = "IDIDI";
		for (Object i : find(str))
			System.out.println(i.toString());
	}

	private static int[] find(String str) {
		int dcount = 0, icount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'I')
				icount++;
			else
				dcount++;
		}

		int arr[] = new int[str.length() + 1];
		if (str.charAt(0) == 'D') {
			arr[0] = str.length() + 1;
		} else {
			arr[0] = 1;
		}
		int prev = arr[0];
		int count = -1;
		boolean flag = true;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'I') {
				arr[i + 1] = prev + dcount + 1;
				prev = arr[i + 1];
				if (flag) {
					count = arr[i + 1] - arr[i];
					flag = false;
				}
				dcount = 0;
			} else {
				arr[i + 1] = count--;
			}
		}
		return arr;
	}
}
