package minglaihan.somealgorithms;

public class ReplaceBlank {
    /**
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
	public static void main(String[] args) {
		String s = "dddd";
		String[] strings = s.split(",");
		System.out.println(strings.length);
	}
    public int replaceBlank(char[] string, int length) {
        // Write your code here
        if(string==null||string.length==0||length<=0){
            return -1;
        }
        
        int whiteCount = 0;
        for(int i=0;i<length;i++){
            if(string[i]==' ')
                whiteCount++;
        }
        int newLen = length + 2*whiteCount;
        int index = newLen;
        if(newLen>string.length){
            return -1;
        }
        if(whiteCount == 0){
            return length;
        }
        length--;//从后向前处理字符
        newLen--;
        while(length>=0&&length<newLen){
            if(string[length]==' '){
                string[newLen--] = '0';
                string[newLen--] = '2';
                string[newLen--] = '%';
            }else{
                string[newLen--] = string[length];
            }
            length--;
        }
        return index;
    }
}
