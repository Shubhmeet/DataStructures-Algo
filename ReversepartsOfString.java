
public class ReversepartsOfString {
//541. Reverse String II
// for every 2k character reverse first k characters
// if u r left with less then k charcater reverse them all
	public String reverseStr(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int i=0,j=0;
        while(i<s.length()){
        	j=i+k<=s.length()?i+k:s.length();
        	sb.append((new StringBuilder(s.substring(i, j))).reverse());
        	if(j>=s.length())
        		break;
        	i=j;
        	j=i+k<=s.length()?i+k:s.length();
        	sb.append(s.substring(i,j));
        	i=j;
        	
        }
        return sb.toString();
    }
}
