package google;

import java.util.HashMap;
import java.util.Map;

public class maxSumSubarraySizeK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4,5};
		int k=3;
		int max=Integer.MIN_VALUE;
		int sum=0;
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<=a.length-k;i++){
			sum=0;
			for(int j=i;j<i+k;j++){
				sum+=a[j];
				
			}
			//System.out.println(i+" "+ sum);
			map.put(sum, i);
			max=Math.max(max, sum);
		}
		int[] sol=new int[k];
		int index=0;
		int l=map.get(max);
		for(int i=l;i<l+k;i++){
			sol[index]=a[i];
			index++;
			System.out.println(sol[index-1]);
		}
		}
	}

