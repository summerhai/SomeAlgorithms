package minglaihan.somealgorithms;

public class StrStr {
	public static void main(String[] args) {
		String a = "mississippi";
		String b = "issip";
		System.out.println(strStr(a, b));
	}
    public static int strStr(String source, String target) {
        if((source==null&&target==null)||(source==null&&target!=null)||(source.length()==0&&target.length()!=0)||target.length()>target.length()){
        	return -1;
        }else if((source.length()==0&&target.length()==0)||(source!=null&&target==null)||(source.length()!=0&&target.length()==0)){
        	return 0;
        }
        int sLen = source.length();
        int tLen = target.length();

        int index = -1;
        
        for(int i=0;i<sLen;i++){//source
        	int k=i,j=0;
        	index=i;
        	while(j<tLen&&k<sLen&&source.charAt(k)==target.charAt(j)){
        		j++;
        		k++;
        		if(j==tLen){
        			return index;
        		}
        	}
        }
        return -1;
    }
}
