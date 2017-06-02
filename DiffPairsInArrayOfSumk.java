import java.util.HashMap;
import java.util.Map;

public class DiffPairsInArrayOfSumk {
// find number of pairse whose sum =k
	 public int findPairs(int[] nums, int k) {
		 int count=0;
		 HashMap<Integer, Integer> map=new HashMap<>();
		 for(int n:nums){
			 map.put(n, map.getOrDefault(n,0)+1);
		 }
		 
		 for(Map.Entry<Integer, Integer> entry:map.entrySet()){
			 if(k==0){
				 if(entry.getValue()>=2)
					 count++;
			 }else{
				 if(map.containsKey(entry.getKey()+k))
					 count++;
			 }
		 }
	 return count;
	 }
}
