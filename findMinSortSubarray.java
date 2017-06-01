import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findMinSortSubarray {
// to find smallest subarray sorting whom can sort the entire array;
	
	public int findUnsortedSubarray(int[] nums) {
		List<Integer> lis=new ArrayList<>();
		List<Integer> ans=new ArrayList<>();
		for(int i=0;i<nums.length;i++){
			lis.add(i, nums[i]);
		}
 		Arrays.sort(nums);
 		
 		for(int i=0;i<nums.length;i++){
 			int n=lis.get(i);
 			if(n!=nums[i]){
 				ans.add(i);
 			}
 		}
 		return ans.get(ans.size()-1)-ans.get(0)+1;
        /*int n=nums.length;
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=nums[i];
        }
        Arrays.sort(temp);
        int start=0;
        int end=n-1;
        while(start<n && nums[start]==temp[start]){
            start++;
            
        }
        while(end>start && nums[end]==temp[end])
        end--;
        
        return end-start+1;*/
    }
}
