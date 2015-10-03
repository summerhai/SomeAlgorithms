package minglaihan.somealgorithms;

public class StringToInteger {
	public static void main(String[] args) {
		String string = "123aaa1";
		System.out.println(myAtoi(string));
	}
	public static int myAtoi(String str) {
		String currentString = str.trim();
		boolean isFu = false;
		if(currentString.startsWith("-")){
			currentString = currentString.substring(1);
			isFu = true;
		}else if(currentString.startsWith("+")){
			currentString = currentString.substring(1);
			isFu = false;
		}
        	
        int size = currentString.length();
        long sum = 0;
        int index = 0;
        for(int i=0;i<size;i++){
        	if(currentString.charAt(i) < '0' || currentString.charAt(i) > '9'){
        		index = i;
        		break;
        	}
        	int current = Integer.valueOf(String.valueOf(currentString.charAt(i)));
        	sum += current*(Math.pow(10, size-1-i));
        }
        //NumberFormat nFormat = NumberFormat.getInstance();
        //System.out.println("sum="+nFormat.format(-sum));
        if(index!=0){
            sum = (long) (sum/(Math.pow(10, size-index)));
        }
        if(!isFu){
            if(sum>Integer.MAX_VALUE){
            	return Integer.MAX_VALUE;
            }
            return (int)sum;
        }else {
        //	System.out.println(-(int)sum);
        	if(-sum<Integer.MIN_VALUE){
            	return Integer.MIN_VALUE;
            }
        	return -(int)sum;
		}
    }
}
