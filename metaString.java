package google;

public class metaString {
// see if changing one character 2 strings bcm the same
	public boolean isMeta(String s, String t){
		if(s.length()!=t.length())
			return false;
		int prev=-1;
		int curr=-1;
		int count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=t.charAt(i)){
				count++;
				if(count>2)
					return false;
				prev=curr;
				curr=i;
			}
		}
		return (count==2 && s.charAt(prev)==t.charAt(curr) && s.charAt(curr)==t.charAt(prev));
	}
}
