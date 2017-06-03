import java.util.List;

public class matchStringwithDictonary {
//524. Longest Word in Dictionary through Deleting
// dictonary has words , find the word which is the largest that can be formed
// by deleting characters from string s , if there are 2 such then return lexiographically
// smaller one
//s = "abpcplea", d = ["ale","apple","monkey","plea"]
//output :"apple"
	 public String findLongestWord(String s, List < String > d) {
		 String lastmatch="";
		 for(String str:d){
			 if(isSubsequence(str,s)){
				 if(str.length()>lastmatch.length() || (str.length()==lastmatch.length()
						 && str.compareTo(lastmatch)<0)){
					 lastmatch=str;
				 }
			 }
			 
		 }
		 return lastmatch;
	 }
	 public boolean isSubsequence(String x, String y){
		 int j=0;
		 for(int i=0;i<y.length();i++){
			 if(j<x.length()){
				 if(x.charAt(i)==y.charAt(j))
					 j++;
			 }
		 }
		 if(j==x.length())
			 return true;
		 return false;
	 }
}
