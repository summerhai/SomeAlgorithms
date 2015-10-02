package minglaihan.somealgorithms;

import java.util.ArrayList;
import java.util.Collections;

public class Subset {
	public static void main(String[] args) {
		ArrayList<Integer> dataArrayList = new ArrayList<Integer>();
		dataArrayList.add(0);
		dataArrayList.add(1);
		dataArrayList.remove(1);
		System.out.println(dataArrayList);
		System.out.println(subsets(dataArrayList));
	}
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> S) {
        // write your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(S==null||S.size()==0){
            return result;
        }
        Collections.sort(S);
        for(int i=1;i<S.size();i++){
        	 helper(result,list,S,0,i);
        }
        result.add(new ArrayList<Integer>());
        return result;
    }
    
    public static void helper(ArrayList<ArrayList<Integer>> result,ArrayList<Integer> list,ArrayList<Integer> nums,int start,int end){
        if(list.size()==end){
        	result.add(list);
        	return;
        }
    	for(int i=start;i<nums.size();i++){
            list.add(nums.get(i));
            helper(result,list,nums,i+1,end);
            list.remove(list.size()-1);
        }
    }
}
