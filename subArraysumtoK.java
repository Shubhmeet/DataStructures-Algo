
public class subArraysumtoK {
// find all those c0ntinous subaarays which add upto K
	 public int subarraySum(int[] nums, int k) {
	        int count=0,sum=0;
	        for(int i=0;i<nums.length;i++){
	        	sum=nums[i];
	        	if(sum==k)
	        		count++;
	           for(int j=i+1;j<nums.length;j++){
	        	   sum+=nums[i];
	        	   if(sum==k)
	        		   count++;
	           }
	        	   
	        }
	        
	        return count;
	    }
}
