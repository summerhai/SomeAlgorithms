package minglaihan.somealgorithms;

public class InvertBinaryTree {
	
    public void invertBinaryTree(TreeNode root) {
        // write your code here
        if(root.val<0||root.val>9)
            return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        invertBinaryTree(root.left);
        invertBinaryTree(root.right);
    }
}
