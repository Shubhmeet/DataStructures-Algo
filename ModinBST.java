package trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ModinBST {
// mod is most likely occuring element in array;
//501. Find Mode in Binary Search Tree
	 HashMap<Integer,Integer> map=new HashMap<>();
	    List<Integer> list=new ArrayList<>();
	    int max=0;
	    public int[] findMode(TreeNode root) {
	        if(root==null){
	            return new int[0];
	        }
	        
	        inorder(root);
	        
	        
	        for(int key: map.keySet()){
	            if(map.get(key) == max) list.add(key);
	        }
	        
	        int[] res = new int[list.size()];
	        for(int i = 0; i<res.length; i++) res[i] = list.get(i);
	        return res; 
	    }
	    public void inorder(TreeNode node){
	       
	        if(node.left!=null) inorder(node.left);
	         map.put(node.val, map.getOrDefault(node.val, 0)+1);
	        max = Math.max(max, map.get(node.val));
	        if(node.right!=null) inorder(node.right); 
	        
	    }
}
