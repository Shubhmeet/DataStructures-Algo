package trees;

public class sameSubtree {
	// if t is a subtree of s
	public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null)
            return false;
        if(isSame(s,t)) 
         return true;
        return isSubtree(s.left, t) || isSubtree(s.right,t);
    }
    
    public boolean isSame(TreeNode s, TreeNode t){
        if(s==null && t==null) return true;
        if(s==null || t==null) return false;
        if(s.val!=t.val)
            return false;
        return isSame(s.left, t.left) && isSame(s.right, t.right);
         
    }
}
/*
 * String spreorder = generatepreorderString(s); 
        String tpreorder = generatepreorderString(t);
        
        return spreorder.contains(tpreorder) ;
    }
    public String generatepreorderString(TreeNode s){
        StringBuilder sb = new StringBuilder();
        Stack<TreeNode> stacktree = new Stack();
        stacktree.push(s);
        while(!stacktree.isEmpty()){
           TreeNode popelem = stacktree.pop();
           if(popelem==null)
              sb.append(",#"); // Appending # inorder to handle same values but not subtree cases
           else      
              sb.append(","+popelem.val);
           if(popelem!=null){
                stacktree.push(popelem.right);    
                stacktree.push(popelem.left);  
           }
        }
        return sb.toString();
 */
 class TreeNode {
	     int val;
	      TreeNode left;
	     TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	 