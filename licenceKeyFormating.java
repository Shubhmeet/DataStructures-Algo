
public class licenceKeyFormating {
//given a string , change to uppercase and put a dash at every k position from right
//Input: S = "2-4A0r7-4k", K = 3
//Output: "24-A0R-74K"
	public static void main(String args[]){
		System.out.println(licenseKeyFormatting("2-4A0r7-4k",3));
	}
	 public static String licenseKeyFormatting(String S, int k){
		 String s1=S.replace("-", "");
		 s1=s1.toUpperCase();
		 StringBuilder sb=new StringBuilder();
		for(int i=0;i<s1.length();i++){
			sb.append(s1.charAt(i));
		}
		int len=sb.length();
		for(int i=k;i<len;i=i+k){
			sb.insert(len-i,"-");
		}
		return sb.toString();
	 }
}
