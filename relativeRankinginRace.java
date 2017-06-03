import java.util.Arrays;

public class relativeRankinginRace {
//given an array with the scores relative find the relative ranking of players
//Input: [4, 5, 3, 2, 1]
//Output: ["Silver Medal", "Gold Medal","Bronze Medal", "4", "5"]
	public String[] findRelativeRanks(int[] nums){
		 int[][] num_pair=new int[nums.length][2];
	        for(int i=0;i<nums.length;i++){
	            num_pair[i][0]=nums[i];
	            num_pair[i][1]=i;
	        }
	        Arrays.sort(num_pair, (a,b)-> (b[0]-a[0]));
	        int index=0;
	        String[] ans=new String[nums.length];
	        for(int i=0;i<nums.length;i++){
	            if(i==0){
	                 index=num_pair[0][1];
	                ans[index]="Gold Medal";
	            }else if(i==1){
	                index=num_pair[1][1];
	                ans[index]="Silver Medal";
	            }else if(i==2){
	                index=num_pair[2][1];
	                ans[index]="Bronze Medal";
	            }else{
	                index=num_pair[i][1];
	                ans[index]=i+1+"";
	            }
	        }
	        return ans;
	}
}
