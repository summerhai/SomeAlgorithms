package minglaihan.somealgorithms;
/*
 * @author:laiming.han
 * @date:2015.9.26
 * 题目：给出一个包含 0 .. N 中 N 个数的序列，找出0 .. N 中没有出现在序列中的那个数。
	样例
	N = 4 且序列为 [0, 1, 3] 时，缺失的数为2
 */
public class MissingNumber {
	public static void main(String[] args) {
		int[] nums = {2};
		System.out.println(findMissing(nums));
	}
	
    public static int findMissing(int[] nums) {
        int len = nums.length;
        for(int i=0;i<len;i++){
        		while (nums[i] >= 0 && nums[i] < len && nums[i] != i && nums[i] != nums[nums[i]]){
        			int temp = nums[i];
                    nums[i] = nums[temp];
                    nums[temp] = temp;
        	}
            
        }
        int i=0;
        for (; i < len; i++)  
            if (nums[i] != i)  
                break;  
        return i;
    }
}
