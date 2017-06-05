package google;

public class NLengthStringFromKLength {
	public void print(int n, char[] k, char[] A) {
		if (n <= 0) {
			System.out.print(String.valueOf(A) + " ");
		} else {
			for (int i = 0; i < k.length; i++) {
				A[n - 1] = k[i];
				//System.out.println(A[n-1]+" "+"hi");
				print(n - 1, k, A);
			}
		}
	}

	public static void main(String[] args) {
		String k = "ALGO";
		int n = 2;
		NLengthStringFromKLength i = new NLengthStringFromKLength();
		i.print(n, k.toCharArray(), new char[n]);
	}
	/* unique all 
	 * public static void main(String[] args) {
  permutation("ABC");
 }
  
 private static void permutation(String string) {
  printPermutation(string,"");
 }
 
 private static void printPermutation(String string, String permutation) {
   
  if(string.length()==0){
   System.out.println(permutation);
   return;
  }
   
  for (int i = 0; i < string.length(); i++) {
   char toAppendToPermutation = string.charAt(i);
   String remaining = string.substring(0, i) + string.substring(i + 1);
    
   printPermutation( remaining,  permutation + toAppendToPermutation);
  }  
 }
 
	 */
}
