package minglaihan.somealgorithms;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class LongestWord {
    /**
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
    ArrayList<String> longestWords(String[] dictionary) {
        // write your code here
        ArrayList<String> result = new ArrayList<String>();
        if(dictionary==null||dictionary.length==0)
            return result;
        Map<Integer,String> treeMap = new TreeMap<Integer,String>();
        for(String word : dictionary){
            int curLen = word.length();
            if(treeMap.containsKey(curLen)){
                String value = treeMap.get(curLen)+","+word;
                treeMap.put(curLen,value);
            }else{
                treeMap.put(curLen,word);
            }
        }
        int maxLen = 0;
        for(Map.Entry<Integer,String> entry : treeMap.entrySet()){
            if(entry.getKey()>maxLen)
                maxLen = entry.getKey();
        }
        String[] values = treeMap.get(maxLen).split(",");
        if(values.length==1){
            result.add(values[0]);
        }else{
            for(int i=0;i<values.length;i++){
                result.add(values[i]);
            }
        }
        return result;
        
    }
}
