package minglaihan.somealgorithms;

public class ValidPalindrome {
	public static void main(String[] args) {
		String s = "a.";
		System.out.println(isPalindrome(s));
	}
    public static boolean isPalindrome(String s) {
    	
        if(s==null||s.length()==0)
            return true;
        int len = s.length();
        s = s.toLowerCase();
        int left = 0;
        int right = len-1;
        while(left<=right){
            char l = s.charAt(left);
            char r = s.charAt(right);
            if((l<'a'||l>'z')&&(l<'0'||l>'9')){
                left++;
                continue;
            }else if((r<'a'||r>'z')&&(r<'0'||r>'9')){
                right--;
                continue;
            }else if(l!=r)
                return false;
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}
