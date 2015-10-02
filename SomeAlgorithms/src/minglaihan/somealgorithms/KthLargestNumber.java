package minglaihan.somealgorithms;

import java.util.ArrayList;
import java.util.Collections;

public class KthLargestNumber {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(1);
		numbers.add(3);
		numbers.add(2);
		System.out.println(kthLargestElement(1, numbers));
		
	}
    public static int kthLargestElement(int k, ArrayList<Integer> numbers) {
        // write your code here
        Collections.sort(numbers);
        for(int i=numbers.size()-1,j=1;i>=0&&j<=k;i--,j++){
        	if(j==k){
        		return numbers.get(i);
        	}
        }
        return 0;
    }
}
