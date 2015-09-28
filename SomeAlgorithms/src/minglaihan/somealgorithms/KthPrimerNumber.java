package minglaihan.somealgorithms;

public class KthPrimerNumber {
	
	public static void main(String[] args) {
		System.out.println(kthPrimeNumber(1111));
	}
    /**
     * @param k: The number k.
     * @return: The kth prime number as description.
     */
    public static long kthPrimeNumber(int k) {
        // write your code here
        if(k<=0)
            return 0;
        
        int[] uglyNumber = new int[k+1];
        uglyNumber[0] = 1;
        int nextUglyIndex = 1;
        int p3 = 0;
        int p5 = 0;
        int p7 = 0;
        while(nextUglyIndex <= k){
            int min = min(uglyNumber[p3]*3,uglyNumber[p5]*5,uglyNumber[p7]*7);
          
            uglyNumber[nextUglyIndex] = min;
            while(uglyNumber[p3]*3<=uglyNumber[nextUglyIndex]){
                p3++;
            }
            while(uglyNumber[p5]*5<=uglyNumber[nextUglyIndex]){
                p5++;
            }
            while(uglyNumber[p7]*7<=uglyNumber[nextUglyIndex]){
                p7++;
            }
            nextUglyIndex++;
            //System.out.println("cur p3="+p3+",p5="+p5+",p7="+p7+",index="+nextUglyIndex+",ugly="+uglyNumber[nextUglyIndex-1]);
        }
        return uglyNumber[nextUglyIndex-1];
    }
    
    public static int min(int a,int b,int c){
        if(a<=b&&a<=c)
            return a;
        else if(b<=a&&b<=c){
            return b;
        }else{
            return c;
        }
    }
}
