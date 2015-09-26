package minglaihan.somealgorithms;

/*
 * @author:laiming.han
 * @date:2015.9.25
 * 题目：今日头条笔试遇到的：给定一个数组A={2,4,9}，给定一个数字n，求数组A中组合数字不大于n的最大数。
 * 例如n=23213，则result=22999。
 */
public class FindNearestNFromA {
	public static void main(String[] args) {
		int[] A = {2,4,9,0};
		int n = 5555;//22999
		System.out.println(findNearsetN(n,A));
	}

	private static int findNearsetN(int n, int[] a) {
		int nlen = String.valueOf(n).length();
		int minOfA = getMin(a);
		int maxOfA = getMax(a);
		int result = -1;
		int firstN = (int) (n/Math.pow(10, nlen-1));
		int[] srcN = changeToArray(n);
		int[] nearN;
		if(firstN<minOfA){
			result = constructValue(maxOfA,nlen-1);
		}else{
			nearN = new int[nlen];
			nearN[0] = getNearestN(srcN[0],a);
			if(nearN[0]==0){
				result = constructValue(maxOfA, nlen-1);
			}else if(srcN[0]>nearN[0]){
				result = (int) (nearN[0]*Math.pow(10, nlen-1)+constructValue(maxOfA, nlen-1));
			}else {
				for(int i=1;i<nlen;i++){
					if(srcN[i]==minOfA){
						nearN[i] = minOfA;
					}else {
						if(srcN[i]>minOfA){
							nearN[i] = getNearestN(srcN[i],a);
							if(srcN[i]>nearN[i]){
								result = constructValue(nearN,maxOfA,i);
								break;
							}
							
						}else{
							result = constructValue(maxOfA, nlen-1);
							break;
						}
					}
				}
			}

			if(result==-1){
				result = getValueFromArray(nearN);
			}
		}
		return result;
	}


	private static int constructValue(int[] nearN, int maxOfA, int index) {
		for(int i=index+1;i<nearN.length;i++){
			nearN[i] = maxOfA;
		}
		int result = getValueFromArray(nearN);
		return result;
	}

	private static int getValueFromArray(int[] newResult) {
		int result = 0;
		for(int i=0;i<newResult.length;i++){
			result = (int) (result + newResult[i]*Math.pow(10, newResult.length-i-1));
		}
		return result;
	}

	private static int getNearestN(int number, int[] a) {
		int near = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++){
			if(a[i]<=number&&a[i]>near){
				near = a[i];
			}
		}
		return near;
	}

	private static int[] changeToArray(int n) {
		int nlen = String.valueOf(n).length();
		int[] result = new int[nlen];
		for(int i=0;i<nlen;i++){
			int curLen = String.valueOf(n).length();
			result[i] = (int) (n/Math.pow(10, curLen-1));
			n = (int) (n%Math.pow(10, curLen-1));
		}
		return result;
	}

	private static int constructValue(int maxOfA, int number) {
		int result = 0;
		for(int i=0;i<number;i++){
			result = (int) (result + Math.pow(10, i)*maxOfA);
		}
		return result;
	}

	private static int getMin(int[] a) {
		int min = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++){
			if(a[i]<min){
				min = a[i];
			}
		}
		return min;
	}
	
	private static int getMax(int[] a) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				max = a[i];
			}
		}
		return max;
	}
}