package backtracking;

public class AllCombinationOfString {

	public static void main(String[] args) {
		String str = "abc";
		// permute(str, 0, str.length() - 1);
		permutation("", str);
	}

	private static void permutation(String prefix, String str) {
		int n=str.length();
		if(n==0)
			System.out.println(prefix);
		else
			for(int i=0;i<str.length();i++)
				permutation(prefix+str.charAt(i), str.substring(0, i)+str.substring(i+1,n));
	}

	private static void permute(String str, int l, int r) {
		if (l == r)
			System.out.println(str);
		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	private static String swap(String str, int l, int r) {
		char[] arr = str.toCharArray();
		char temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
		return String.valueOf(arr);
	}
}
