package google;

public class createStringfromNumbers {
	public static void main(String[] args) {
		String given = "a4b2c2a3f1g2";
		String result="";
		for(int i=0;i<given.length();i+=2){
			int s=Integer.parseInt(given.substring(i+1,i+2));
			//System.out.println(s);
			for(int j=0;j<s;j++){
				result +=given.charAt(i)+"";
			}
		}
		System.out.print(result);
	
	
	}
	

	
}
