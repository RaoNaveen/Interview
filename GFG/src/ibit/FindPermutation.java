package ibit;

public class FindPermutation {

	public static void main(String[] args) {
		String str = "abc";
		permute(str);
	}

	private static void permute(String str) {
		permuteUtil("", str);
	}

	private static void permuteUtil(String prefix, String str) {
		int n=str.length();
		if(n==0)
			System.out.println(prefix);
		else {
			for(int i=0;i<str.length();i++) {
				permuteUtil(prefix+str.charAt(i), str.substring(0, i)+str.substring(i+1));
			}
		}
	}
}
