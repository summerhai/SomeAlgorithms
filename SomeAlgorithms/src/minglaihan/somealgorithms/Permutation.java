package minglaihan.somealgorithms;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums==null||nums.length==0){
            return result;
        }
        recall(result,nums,0,nums.length-1);
        return result;
    }
    
    public void recall(List<List<Integer>> result,int[] nums,int start,int end){
        if(start==end){
            List<Integer> list = new ArrayList<Integer>();
            for(int i:nums){
                list.add(i);
            }
            result.add(list);
        }else{
            for(int i=start;i<=end;i++){
                int temp = nums[start];
                nums[start] = nums[i];
                nums[i] = temp;
                recall(result,nums,start+1,end);
                temp = nums[start];
                nums[start] = nums[i];
                nums[i] = temp;
            }
        }
    }
}
