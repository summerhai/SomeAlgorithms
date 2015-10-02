package minglaihan.somealgorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class KthAllOrder {
	static{
		init();
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		for(int i=0;i<number;i++){
			String line = scanner.nextLine();
			if(line == null){
				System.out.println(-1);
			}else {
				findKth(line);
			}
		}
	}

	private static void init() {//建立一个字典树
		Trie root = new Trie();
		for(int i=0;i<12;i++){
			
		}
		
	}

	private static void findKth(String line) {
		 ArrayList<Integer> temp = new ArrayList<Integer>();
		 Integer[] nums = (Integer[])temp.toArray(new Integer[temp.size()]);
	}

}
