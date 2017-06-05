package google;

public class robotMaxdistance {
	public static void main(String[] args){
		String s="LLRRLLLL??LLL??RLR";
		int r=maxDistance(s,0);
	    System.out.println(r);
		
	}
	
	public static int maxDistance(String s, int count){
		//System.out.println(count+ " "+s);
		if(s.length()!=0){
			if(s.charAt(0)=='L')
				return maxDistance(s.substring(1), --count);
			else if(s.charAt(0)=='R')
				return maxDistance(s.substring(1), ++count);
			else
				return Math.max(maxDistance(s.substring(1), --count), maxDistance(s.substring(1), ++count));
		}else
		return Math.abs(count);
	}
}
