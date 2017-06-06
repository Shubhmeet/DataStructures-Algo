import java.util.ArrayList;
import java.util.List;

public class findDuplicateNumberinArray {
//given an array 1<a[i]<=n where n is size
//find duplicate values of the arr
//442. Find All Duplicates in an Array
	public List<Integer> findDuplicates(int[] nums) {
	List<Integer> li=new ArrayList<Integer>();
    for(int i=0;i<nums.length;i++){
	int index=Math.abs(nums[i])-1;
	if(nums[index]>0)
		nums[index]=-nums[index];
	else
			li.add(Math.abs(nums[i]));
    }
	return li;
    }
}
