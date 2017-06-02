import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TimeDifferenceMin {
	//539 Time Difference
	//given time in 24 hr clock , change them all to min
	// sort them 
	// check the one with the smallest diff
	//edge case if smallest and larget r min
	// eg 23:59 and 00:00 = 1439 and 0
	// add these n see the final diff 
	public int findMinDifference(List<String> timePoints) {
		
		List<Integer> li=new ArrayList<Integer>();
		for(int i=0;i<timePoints.size();i++){
			int h=Integer.parseInt(timePoints.get(i).substring(0,2));
			int m=Integer.parseInt(timePoints.get(i).substring(3,5));
			li.add(h*60+m);
		}
		Collections.sort(li);
		
		int min=Integer.MAX_VALUE;
		for(int i=1;i<li.size();i++){
			min=Math.min(min, li.get(i)-li.get(i-1));
		}
		int corner=li.get(0)+(1440-li.get(li.size()-1));
		return Math.min(min, corner);
	}
}