
public class OptimalDivision {
// show the division to be done such that the result is max , place the parenthesis accordingly
	// key rule is result will be max when x1*x3*...xn/x2 =x1/(x2/x3/...xn)
	// ans=x1/x2 *y some y should be max 
	
	 public String optimalDivision(int[] nums) {
	        StringBuilder sb=new StringBuilder();
	        sb.append(nums[0]);
	        for(int i=1; i<nums.length; i++){
	            if(i==1 && nums.length>2){
	                sb.append("/(").append(nums[i]);
	            }else{
	                sb.append("/").append(nums[i]);
	            }
	        }
	        if(nums.length>2){
	        sb.append(")");
	        }
	        return sb.toString();
	    }
}
