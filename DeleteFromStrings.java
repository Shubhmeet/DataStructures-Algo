
public class DeleteFromStrings {
// delete one charcter at a time to make 2 strings same
	// this is equilaent to finding common length and substracting it fro total length
	//common length comes from length of common subsequence
	public int minDistance(String word1, String word2) {
	       return word1.length()+word2.length()-2*longestcommonsequence(word1,word2);
	    }
	    
	    public int longestcommonsequence(String word1, String word2){
	        int[][] res=new int[word1.length()+1][word2.length()+1];
	        
	        for (int i = 1; i <= word1.length(); i++) {
	        for (int j = 1; j <= word2.length(); j++) {
	                if(word1.charAt(i-1)==word2.charAt(j-1)){
	                    res[i][j]=res[i-1][j-1]+1;
	                }else{
	                    res[i][j]=Math.max(res[i-1][j], res[i][j-1]);
	                }
	            
	        }
	       
	    }
	     return Math.max(res[word1.length()][word2.length()], 0);
	}
}
