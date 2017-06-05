package google;

public class Permutation {
	
		 
	    /* arr[]  ---> Input Array
	    data[] ---> Temporary array to store current combination
	    start & end ---> Staring and Ending indexes in arr[]
	    index  ---> Current index in data[]
	    r ---> Size of a combination to be printed */
	    static void combinationUtil(char arr[], char data[], int start,
	                                int end, int index, int r, char y)
	    {
	        // Current combination is ready to be printed, print it
	        if (index == r)
	        {
	            for (int j=0; j<r; j++){
	            if (data[0]==y){
	                System.out.print(data[j]+" ");
	            }
	            }
	            if (data[0]==y){
	            System.out.println("");
	            }
	            return;
	        }
	 
	        // replace index with all possible elements. The condition
	        // "end-i+1 >= r-index" makes sure that including one element
	        // at index will make a combination with remaining elements
	        // at remaining positions
	        for (int i=start; i<=end && end-i+1 >= r-index; i++)
	        {
	            data[index] = arr[i];
	            //System.out.println(data[index]+""+"h");
	            //if (start==y){
	            combinationUtil(arr, data, i+1, end, index+1, r, y);
	            //}
	        }
	    }
	 
	    // The main function that prints all combinations of size r
	    // in arr[] of size n. This function mainly uses combinationUtil()
	    static void printCombination(char arr[], int n, int r, char y)
	    {
	        // A temporary array to store all combination one by one
	        char data[]=new char[r];
	 
	        // Print all combination using temprary array 'data[]'
	        combinationUtil(arr, data, 0, n-1, 0, r, y);
	    }
	 
	    /*Driver function to check for above function*/
	    public static void main (String[] args) {
//	        char arr[] = {'p','r','a','t','i','k'};
	    String s1="pratik";  
	    char[] arr=s1.toCharArray();  
	      
	        int r = 3;
	        char y = 'r';
	        int n = arr.length;
	        printCombination(arr, n, r, y);
	    }
	}
