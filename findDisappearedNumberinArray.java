import java.util.ArrayList;
import java.util.List;

public class findDisappearedNumberinArray {
// given an array 1<a[i]<=n where n is size of array , find the number i
//which are missing in array
//448. Find All Numbers Disappeared in an Array
	
	public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> li=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
        	int index=Math.abs(nums[i])-1;
        	if(nums[index]>0)
        		nums[index]=-nums[index];
        }
        for(int i=0;i<nums.length;i++){
        	if(nums[i]>0)
        		li.add(i+1);
        }
        return li;
	}
	
}
