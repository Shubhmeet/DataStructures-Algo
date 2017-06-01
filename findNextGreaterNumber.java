import java.util.Arrays;

public class findNextGreaterNumber {
// given number find the next greater element
	// find that i-1 which is the first small then i from rigthside
	// find smallest number  from i to length ,greater than num[i-1] 
	// swap the smallest and i-1
	// sort the remaining element i to length
	 public int nextGreaterElement(int n) {
		 char[] num=(n+"").toCharArray();
		 int i,j;
		 for(i=num.length-1;i>0;i--){
			 if(num[i-1]<num[i])
				 break;
		 }
		 if(i==0)
			 return -1;
		 int x=num[i-1];
		 int smallest=i;
		 for(j=i+1;j<num.length;j++){
			 if(num[j]>x && num[j]<num[smallest])
				 smallest=j;
		 }
		 char temp=num[smallest];
		 num[smallest]=num[i-1];
		 num[i-1]=temp;
		 
		 Arrays.sort(num,i , num.length);
		 long val = Long.parseLong(new String(num));
	        return (val <= Integer.MAX_VALUE) ? (int) val : -1;
		 

	}
}