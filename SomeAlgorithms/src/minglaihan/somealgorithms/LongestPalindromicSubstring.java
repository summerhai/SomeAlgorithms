package minglaihan.somealgorithms;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if(s==null||s.length()==0||s.length()==1){
            return s;
        }
        int len = s.length();
        String longest = s.substring(0,1);
        for(int i=0;i<len;i++){
            // get longest palindrome with center of i
            String cur = getPalindrome(s,i,i);
            if(cur.length()>longest.length()){
                longest = cur;
            }
            // get longest palindrome with center of i, i+1
            cur = getPalindrome(s,i,i+1);
            if(cur.length()>longest.length()){
                longest = cur;
            }
        }
        return longest;
    }
    
    public String getPalindrome(String s,int start,int end){
        while(start>=0&&end<s.length()&&s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }
        return s.substring(start+1,end);
    }
}
