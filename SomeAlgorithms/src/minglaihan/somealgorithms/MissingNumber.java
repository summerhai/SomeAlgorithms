package minglaihan.somealgorithms;
/*
 * @author:laiming.han
 * @date:2015.9.26
 * ��Ŀ������һ������ 0 .. N �� N ���������У��ҳ�0 .. N ��û�г����������е��Ǹ�����
	����
	N = 4 ������Ϊ [0, 1, 3] ʱ��ȱʧ����Ϊ2
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
