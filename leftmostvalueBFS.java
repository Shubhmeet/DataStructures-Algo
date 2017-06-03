package trees;

import java.util.LinkedList;
import java.util.Queue;

public class leftmostvalueBFS {
//find the left most bottom value in the given tree 
//variation of BFS
	 public int findBottomLeftValue(TreeNode root) {
		 Queue<TreeNode> q=new LinkedList<>();
		 TreeNode node=null;
		 q.offer(root);
		 while(!q.isEmpty()){
			 node=q.poll();
			 if(node.right!=null)
				 q.offer(node.right);
			 if(node.left!=null)
				 q.offer(node.left);
			 
		 }
		 return node.val;
	 }
}
