package minglaihan.somealgorithms;

public class AddBinary {
	public static void main(String[] args) {
		String aString = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
		String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
		System.out.println(addBinary(aString, b));
	}
    public static String addBinary(String a, String b) {
        int m = a.length();
        int n = b.length();
        int carry = 0;
        String res = "";
        int maxLen = Math.max(m, n);
        for (int i = 0; i < maxLen; i++) {
            int p=0,q=0;
            if(i<m)
                p = a.charAt(m-1-i) - '0';
            else
                p = 0;
            
            if(i<n)
                q = b.charAt(n-1-i)-'0';
            else
                q = 0;
                
            int tmp = p + q + carry;
            carry = tmp / 2;
            res = tmp % 2 +res;
        }
        return (carry == 0) ? res : "1" + res;
    }

}
