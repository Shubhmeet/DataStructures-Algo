package google;

public class longestsubstringkdistinctchar {
	public static void main(String[] args){
		String s="ecea";
		System.out.println(lengthOfLongestSubstringKDistinct(s,2));
	}
	public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] count = new int[256];
        int num = 0, i = 0, res = 0;
        for (int j = 0; j < s.length(); j++) {
        	System.out.println(count[s.charAt(j)] + " " +s.charAt(j));
            if (count[s.charAt(j)]++ == 0){ num++;
            }
            System.out.println(count[s.charAt(j)] + " " +s.charAt(j)+" "+ num);
            if (num > k) {
                while (--count[s.charAt(i++)] > 0);
                num--;
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}
