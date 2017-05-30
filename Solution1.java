
public class Solution1 {
	public int maxCount(int m, int n, int[][] ops) {
        if(ops.length==0 || ops==null){
            return m*n;
        }
        int row_max=m;
        int col_max=n;
        for(int [] op:ops){
            row_max=Math.min(row_max,op[0]);
            col_max=Math.min(col_max,op[1]);
        }
        return row_max*col_max;
    }
}
