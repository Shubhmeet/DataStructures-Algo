import java.util.HashSet;
import java.util.Set;

public class distributeCandies {
// given a array where each number tells the type of candies , divide this into brother an
	// sister such that sister gets max diff types of candies 
	//575. Distribute Candies
	/*Input: candies = [1,1,2,3]
			Output: 2
			Explanation: For example, the sister has candies [2,3] and the brother has candies [1,1]. 
			The sister has two different kinds of candies, the brother has only one kind of candies.
*/
	
	public int distributeCandy(int[] candies) {
        Set<Integer> s=new HashSet<Integer>();
        for(Integer c:candies){
            s.add(c);
        }
        
         return Math.min(s.size(), candies.length/2);
    }
}
