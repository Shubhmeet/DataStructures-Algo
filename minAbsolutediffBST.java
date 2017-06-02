package trees;

public class minAbsolutediffBST {
	int min=Integer.MAX_VALUE;
	TreeNode prev=null;
	 public int getMinimumDifference(TreeNode root) {
		 
		 if(root==null) return 0;
		 getMinimumDifference(root.left);
		 if(prev!=null){
			 min=Math.min(min, root.val-prev.val);
		 }
		 prev=root;
		 getMinimumDifference(root.right);
		 return min;
	 }
}
