import java.util.ArrayList;
import java.util.List;

public class reshapeMatrix {
// given n*m matrix change it to r*c;
	//566. Reshape the Matrix
	/*
	 * Another way to do it :
	 * 
	 * if(r*c !=n*m) return originalarray;
	 * for(int i=0;i<r*c;i++){
	 *  newarray[i/c][i%c]=originalarray[i/m][i%m];
	 * }
	 */
	
	
	public int[][] matrixReshape(int[][] nums, int r, int c) {
        List<Integer> li=new ArrayList<Integer>();
        if(r*c != nums.length*nums[0].length)
            return nums;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                li.add(nums[i][j]);
            }
        }
        int count=-1;int l=0,m=0;;
        int[][] ans=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                 count++;
                 if(count<li.size()){
               ans[i][j]=li.get(count);
                     
                 }else{
                     
                     break;
                 }
              
            }
        }
        
        return ans;
    }
}
