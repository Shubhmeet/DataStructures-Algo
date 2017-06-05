package google;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class findSubsequenceArray {
    
	public static void main(String args[]){
		Scanner can=new Scanner(System.in);
		int[] nums={4,6,7,7};
		
		List<List<Integer>> li=findSubsequences(nums);
		for(int i=0;i<li.size();i++){
			List<Integer> r=li.get(i);
			for(Integer z:r){
				//System.out.print(z+" ");
			}
			//System.out.println();
		}
	}
	public static List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> res= new HashSet<List<Integer>>();
        List<Integer> holder = new ArrayList<Integer>();
        findSequence(res, holder, 0, nums);
        @SuppressWarnings("unchecked")
		List result = new ArrayList(res);
        return result;
    }

   public static void findSequence(Set<List<Integer>> res, List<Integer> holder, int index, int[] nums) {
       if (holder.size() >= 2) {
           res.add(new ArrayList(holder));
           for(Integer s:holder){
        	   System.out.print("holder "+s+" ");
           }
           System.out.println("");
       }
       for (int i = index; i < nums.length; i++) {
           if(holder.size() == 0 || holder.get(holder.size() - 1) <= nums[i]) {
        	   System.out.println(nums[i]);
               holder.add(nums[i]);
               findSequence(res, holder, i + 1, nums);
               holder.remove(holder.size() - 1);
           }
       }
   }
}
