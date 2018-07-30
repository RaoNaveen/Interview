package string;

public class StringPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("1a2"));
	}
	public static int isPalindrome(String A) {
        int start=0;
        int end=A.length()-1;
        A=A.toLowerCase();
        while(start<end){
            if(A.charAt(start)>=65 && A.charAt(start)<=90 || A.charAt(start)>=97 && A.charAt(start)<=122 || A.charAt(start)>=48 && A.charAt(start)<=57){
                if(A.charAt(end)>=65 && A.charAt(end)<=90 || A.charAt(end)>=97 && A.charAt(end)<=122 || A.charAt(end)>=48 && A.charAt(end)<=57){
                if(A.charAt(start)!=A.charAt(end)){
                    return 0;
                }else {
                	start++;end--;
                }
            }else{
                end--;
            }
            }else{
                start++;
            }
        }
        return 1;
    }

}
