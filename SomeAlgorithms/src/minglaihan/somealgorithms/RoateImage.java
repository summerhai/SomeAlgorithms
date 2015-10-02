package minglaihan.somealgorithms;

import java.util.Arrays;

public class RoateImage {
	public static void main(String[] args) {
		int[][] num = {{1,2},{3,4}};
		rotate2(num);
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.println(num[i][j]);
			}
		}
	}
	public static void rotate2(int[][] matrix){
        if(matrix==null||matrix.length==0){
            return;
        }
        int n = matrix.length;
        for(int i=0;i<n/2;i++){
        	for(int j=0;j<(n+1)/2;j++){
        		int temp = matrix[i][j];
        		matrix[i][j] = matrix[n-j-1][i];
        		matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
        		matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
        		matrix[j][n-i-1] = temp;
        		
        	}
        }
	}
	
    public static void rotate1(int[][] matrix) {
        if(matrix==null||matrix.length==0){
            return;
        }
        int n = matrix.length;
        int[][] newNum = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                newNum[j][n-1-i] = matrix[i][j];
            }
        } 
        
        for(int i=0;i<n;i++){
            
            for(int j=0;j<n;j++){
                matrix[i][j] = newNum[i][j];
            }
        }
    }
}
