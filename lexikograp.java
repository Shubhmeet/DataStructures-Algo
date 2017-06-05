package google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class lexikograp {
// length jihdi vdi e ya lexigraphocally chota e
	public static void main(String args[])
	{
		List<String> s=new ArrayList<>();
		s.add("ale");
		s.add("a");
		s.add("apple");
		s.add("ael");
		Collections.sort(s, new Comparator < String > () {
            public int compare(String s1, String s2) {
                return s2.length() != s1.length() ? s2.length() - s1.length() : s1.compareTo(s2);
            }
        });
		for(String l:s){
			System.out.println(l);
		}
		
	}
}
