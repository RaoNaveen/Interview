package string;

public class MinCharToMakeAStringPalindrome {

	public static void main(String[] args) {
		System.out.println(solve("AACECAAAA"));
	}
	
	public static int solve(String A) {
        int count=0;
        while(!isPalindrome(A)){
            A=A.substring(0,A.length()-1);
            count++;
        }
        return count;
    }
    
    public static boolean isPalindrome(String str){
        int start=0;int end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end))
                return false;
            start++;end--;
        }
        return true;
    }

}
