package trees;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class DelFromTree {
// delete the value from the tree and its children , given a list of id and list of its parents
	public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        Map<Integer , List<Integer>> map1=new HashMap<Integer, List<Integer>>();
        for(int i=0;i<pid.size();i++){
            map1.putIfAbsent(ppid.get(i),new ArrayList<Integer>());
            map1.get(ppid.get(i)).add(pid.get(i));
        }
        
        List<Integer> ans=new ArrayList<Integer>();
        Queue<Integer> q=new ArrayDeque<>();
        q.add(kill);
        while(!q.isEmpty()){
            int n=q.poll();
            ans.add(n);
            if(map1.containsKey(n)){
                q.addAll(map1.get(n));
            }
        }
        return ans;
    }
}
