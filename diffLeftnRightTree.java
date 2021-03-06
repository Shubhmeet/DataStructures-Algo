package trees;

public class diffLeftnRightTree {
// find the diff b/w left and right node at every node and calculate the total sum like
	// for all nodes in the tree
	/*class TreeNode {
		 *     int val;
		 *     TreeNode left;
		 *     TreeNode right;
		 *     TreeNode(int x) { val = x; }
		 * }
		 */
	/*
	 * int result=0;
    public int findTilt(TreeNode root) {
        postOrder(root);
        return result;
    }
    
    public int postOrder(TreeNode root){
        if(root==null)
            return 0;
        int left= postOrder(root.left);
        int right =postOrder(root.right);
        
        result+=Math.abs(left-right);
        return left+ right +root.val;
    }
	 */
	
	public int findTilt(TreeNode root) {
       if(root==null) return 0;
   return Math.abs(sum(root.left,0))-Math.abs(sum(root.right,0))+findTilt(root.left)+ findTilt(root.right);
    }
	
	public int sum(TreeNode root, int sum){
		if(root==null) return sum;
		return sum(root.left,sum)+sum(root.right,sum)+root.val;
	}
}
