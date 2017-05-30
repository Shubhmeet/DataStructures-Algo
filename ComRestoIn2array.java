import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComRestoIn2array {
// find common resaurent from 2 arrays and find the one which has sum = least indices 
	//599. Minimum Index Sum of Two Lists
	public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String , Integer> map1=new HashMap<String, Integer>();
        Map<String , Integer> map2=new HashMap<String, Integer>();
        
        for(int i=0;i<list1.length;i++){
            map1.put(list1[i],i);
        }
        
        for(int i=0;i<list2.length;i++){
            map2.put(list2[i],i);
        }
        int sum=0;
        int min=Integer.MAX_VALUE;
        List<String> re=null;
        for(int i=0;i<list1.length;i++){
           if(map2.containsKey(list1[i])){
               sum= map1.get(list1[i])+map2.get(list1[i]);
               
               if(sum<min){
                   min=sum;
                   re=new ArrayList<String>();
                   re.add(list1[i]);
               }else if(sum==min){
                   re.add(list1[i]);
               }
           }
        } 
           String[] s=new String[re.size()];
           for (int j = 0; j < re.size(); j++) {
            s[j] = re.get(j);
        }
        
        return s;
        
    }

}
