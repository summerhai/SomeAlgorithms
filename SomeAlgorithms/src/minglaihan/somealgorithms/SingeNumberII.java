package minglaihan.somealgorithms;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * singleNumber:һ�����飬���������ظ���2�Σ���һ��������1�Σ��ҳ���
 * �����
 * singleNumberII:������������3�Σ��ҳ�����һ�ε���
 * λ����
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
    
    
    //2��λ����
	// Time: O(n), space: O(1)
	// ����˼����ÿ���������Ա�ʾ�ɶ�������ʽ������ͳ��ÿ������ÿһλ���ֵĴ���
	public static int singleNumber2(int[] A) {
		// ����һ������Ϊ32������countsPerBit��
		// countsPerBit[i]��ʾA������������iλ���ֵĴ���
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
