package minglaihan.somealgorithms;

public class DigitCounts {
	public static void main(String[] args) {
		int n = 12;
		int k = 1;
		System.out.println(Integer.MAX_VALUE);
	}

	private static int digitCounts(int n, int k) {
		if(k<0||k>9)
			return 0;
		int nLen = String.valueOf(n).length();
		int value = n;
		int[] data = new int[nLen];
		for(int i=0;i<nLen;i++){
			int curLen = String.valueOf(value).length();
			data[i] = (int) (value/(Math.pow(10, curLen-1)));
			value = (int) (value%(Math.pow(10, curLen-1)));
			//System.out.println(data[i]);
		}
		int count = 0;
		int[] para = new int[nLen];
		for(int i=0;i<nLen;i++){
			if(data[i]==k){
				count++;
			}
		}
		return 0;
	}
}
