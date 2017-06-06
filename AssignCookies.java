import java.util.Arrays;

public class AssignCookies {
//given greedy factor for n children 
// cookies given 
//each child can get only 1 cookie
//child get content if he get cookie[i] >= his greed factor
//max children content
//455. Assign Cookies

	 public int findContentChildren(int[] g, int[] s) {
		 Arrays.sort(g);
		 Arrays.sort(s);
		 int pointG=0;
		 int pointS=0;
		 while(pointG<g.length && pointS<s.length){
			 if(g[pointG]<=s[pointS])
			 {
				 pointG++;
				 pointS++;
			 }else
				 pointS++;
		 }
		 return pointG;
}
}