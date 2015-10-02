package minglaihan.somealgorithms;

public class Trie {
	private int SIZE = 26;
	private TrieNode root;
	
	public Trie() {
		root = new TrieNode();
	}
	
	private class TrieNode{
		private int num;
		private TrieNode[] son;
		private boolean isEnd;
		private char val;
		
		public TrieNode() {
			num = 1;
			son = new TrieNode[SIZE];
			isEnd = false;
		}
	}
	
	public void insert(String str){
		if(str == null||str.length() == 0){
			return ;
		}
		TrieNode node = root;
		char[] letters = str.toCharArray();
		for(int i=0;i<str.length();i++){
			int pos = letters[i] - 'a';
			if(node.son[pos] == null){
				node.son[pos] = new TrieNode();
				node.son[pos].val = letters[i];
			}else {
				node.son[pos].num++;
			}
			node = node.son[pos];
		}
		node.isEnd = true;
	}
	
	
}
