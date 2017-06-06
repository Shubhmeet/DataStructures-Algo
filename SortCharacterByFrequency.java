import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharacterByFrequency {
// sort the character , such that the one with high frequency shows first
// tree : eert or eetr 
//451. Sort Characters By Frequency
	 public String frequencySort(String s){
		 Map<Character, Integer> map=new HashMap<Character ,Integer>();
		 for(int i=0;i<s.length();i++){
			 map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		 }
		 List<Map.Entry<Character, Integer>> li=new ArrayList<>(map.entrySet());
		 Collections.sort(li, (a1,b1) -> b1.getValue()-a1.getValue());
		 StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character, Integer> entry: li){
        	for(int i=0;i<entry.getValue();i++){
        		sb.append(entry.getKey());
        	}
        }
        return sb.toString();
		 
	 }
}
