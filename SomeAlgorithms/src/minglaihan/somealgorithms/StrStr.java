package minglaihan.somealgorithms;

public class StrStr {
	public static void main(String[] args) {
		String a = "abcdabcdefg";
		String b = "bcd";
		System.out.println(strStr(a, b));
	}
    public static int strStr(String source, String target) {
        if((source==null&&target==null)||(source==null&&target!=null)||(source.length()==0&&target.length()==0)||(source.length()==0&&target.length()!=0)||target.length()>target.length()){
        	return -1;
        }else if((source!=null&&target==null)||(source.length()!=0&&target.length()==0)){
        	return 0;
        }
        int sLen = source.length();
        int tLen = target.length();

        char t1 = target.charAt(0);
        int index = -1;
        boolean isSubString = true;
        for(int i=0;i<sLen;i++){
           if(source.charAt(i)==t1){
               for(int j=1,k=i+1;j<tLen;j++,k++){
                   if(target.charAt(j)!=source.charAt(k)){
                       isSubString = false;
                   }
               }
               if(isSubString){
                   index = i;
                   break;
               }
           }
        }
        return index;
    }
}
