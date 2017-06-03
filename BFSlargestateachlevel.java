package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSlargestateachlevel {
//find largest value in each row
	public List<Integer> largestValues(TreeNode root) {
		Queue<TreeNode> q=new LinkedList<>();
		List<Integer> ans=new ArrayList<>();
		if(root!=null)
			q.offer(root);
		while(!q.isEmpty()){
			int n=q.size();
			int maxVal=Integer.MIN_VALUE;
			for(int i=0;i<n;i++){
				TreeNode node=q.poll();
				maxVal=Math.max(maxVal,node.val);
				if(node.left!=null) q.offer(node.left);
				if(node.right!=null) q.offer(node.right);
			}
			ans.add(maxVal);
		}
		return ans;
		
 	}
}
