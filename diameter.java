package trees;

public class diameter {

	int maxd=0;
    public int diameterOfBinaryTree(TreeNode root) {
       maxDepth(root);
       return maxd;
    }
    public int maxDepth(TreeNode root){
        if(root==null)
            return 0;
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        maxd=Math.max(maxd, left+right);
        
        return Math.max(left, right)+1;
    }
}
