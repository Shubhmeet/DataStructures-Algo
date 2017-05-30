import java.util.HashSet;
import java.util.Set;

public class canMakeSquare {
//593. Valid Square
	//given 4 points , see if it is a square or not
	public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
	Set<Double> s=new HashSet<Double>();
    double d1=getDistance(p1,p2);
    double d2=getDistance(p1,p3);
    double d3=getDistance(p1,p4);
    double d4=getDistance(p2,p3);
    double d5 =getDistance(p2,p4);
    double d6=getDistance(p3,p4);
    s.add(d1);
    s.add(d2);
    s.add(d3);
    s.add(d4);
    s.add(d5);
    s.add(d6);
    if(s.size()==2){
        for(double i:s){
            if(i<=0){
                return false;
            }
        }
        return true;
    }
    return false;
}

	public double getDistance(int[] p1, int[] p2){
	    return (p1[0]-p2[0])*(p1[0]-p2[0]) + (p1[1]-p2[1])*(p1[1]-p2[1]);
	}
}
//first 3 check if it is a rectangle and last check for square
/*public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4){
 int d1 = getDist(p1, p2);
if (d1 == 0 || d1 != getDist(p3, p4)) return false;
int d2 = getDist(p1, p3);
if (d2 == 0 || d2 != getDist(p2, p4)) return false;
int d3 = getDist(p1, p4);
if (d3 == 0 || d3 != getDist(p2, p3)) return false;
if (d1 == d2 || d1 == d3 || d2 == d3) return true;
return false;
}

private int getDist(int [] p1, int [] p2) {
return (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
}*/