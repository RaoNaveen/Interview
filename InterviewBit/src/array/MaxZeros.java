package array;

public class MaxZeros {
	public static void main(String[] args) {
		String str = "010";
		for (int i : flip(str))
			System.out.println(i);
	}
	public static int[] flip(String A) {
        int arr[]=new int[2];
        int templ=-1;
        int l=-1;int r=-1;
        int maxTemp=0,maxPerma=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='1')
            maxTemp--;
            else{
            maxTemp++;
            if(templ==-1)
            templ=i;
            }
            
            if(maxTemp<0){
                maxTemp=0;
                templ=-1;
            }
            
            if(maxPerma<maxTemp){
                maxPerma=maxTemp;
                l=templ;
                r=i;
            }
        }
        if(l==-1)
        return new int[0];
        else{
            arr[0]=l+1;
            arr[1]=r+1;
            return arr;
        }
    }

}
