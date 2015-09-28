package minglaihan.somealgorithms;

import java.util.Map;
import java.util.TreeMap;

class Point {
    int x;
    int y;
    Point() { x = 0; y = 0; }
    Point(int a, int b) { x = a; y = b; }
}

public class MaxPoints {

	 public static void main(String[] args) {
		Point point1 = new Point(1,2);
		Point point2 = new Point(3,6);
		Point point3 = new Point(0,0);
		Point point4 = new Point(1,3);
		Point[] points = new Point[4];
		points[0] = point1;
		points[1] = point2;
		points[2] = point3;
		points[3] = point4;
		System.out.println(maxPoints(points));
	}
    public static int maxPoints(Point[] points) {
        // Write your code here
        if(points==null||points.length==0)
            return 0;
        boolean isCount = false;
        Map<Double,Integer> map = new TreeMap<Double,Integer>();
        for(int i=0;i<points.length;i++){
        	double key = 0.0;
        	if(points[i].x==0&&points[i].y==0){
        		isCount = true;
        	}
        	if(points[i].x!=0){
        		key = points[i].y/points[i].x;
        	}
            if(map.containsKey(key)){
            	map.put(key, map.get(key)+1);
            }else {
				map.put(key, 1);
			}
        }
        //(0,0)是特殊点，无论怎样必然经过，如果出现，那么系数为0的要减一
        
        int count = 0,bestValue=0;
        
        for(Map.Entry<Double, Integer> entry : map.entrySet()){
        	//System.out.println("key="+entry.getKey()+",value="+entry.getValue());
        	if(entry.getKey()==0){
        		if(isCount){
        			count++;
        			int value = entry.getValue()-1;
        			map.put(entry.getKey(), value);
        		}
        	}
        	if(entry.getValue()>bestValue){
        		bestValue = entry.getValue();
        	}
        }
        return count+bestValue;
    }
}
