package minglaihan.somealgorithms;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * singleNumber:一个数组，所有数都重复了2次，有一个数出现1次，找出。
 * 异或解决
 * singleNumberII:所有数出现了3次，找出出现一次的数
 * 位运算
 * @author minglaihan
 *
 */
public class SingeNumberII {
	//ac1:Hash
    public int singleNumber(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i:nums){
            if(map.containsKey(i)){
                int count = map.get(i)+1;
                map.put(i,count);
            }else{
                map.put(i,1);
            }
        }
        int singleNumber = 0;
        for(Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()!=3){
                singleNumber = entry.getKey();
            }
        }
        return singleNumber;
    }
    
    
    //2：位运算
	// Time: O(n), space: O(1)
	// 基本思想是每个数都可以表示成二进制形式，进而统计每个数在每一位出现的次数
	public static int singleNumber2(int[] A) {
		// 创建一个长度为32的数组countsPerBit，
		// countsPerBit[i]表示A中所有数字在i位出现的次数
		int[] countsPerBit = new int[32];
		int result = 0;
		for(int i=0; i<32; i++){
			for(int j=0; j<A.length; j++){
				if(((A[j] >> i) & 1) == 1){
					countsPerBit[i] = (countsPerBit[i] + 1) % 3;
				}
			}
			result |= (countsPerBit[i] << i);
		}
		return result;
	}
}
