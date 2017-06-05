
public class consecutive1countInArray {
//485. Max Consecutive Ones
	public int findMaxConsecutiveOnes(int[] nums){
		int max=0, maxTillNow=0;
		for(int num:nums){
			maxTillNow=(num==0?0:maxTillNow+1);
			max=Math.max(maxTillNow, max);
			
		}
		return max;
	}
}
