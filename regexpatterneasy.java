
public class regexpatterneasy {
//500 Keyboard row
	
   public static void main(String args[]){
	   String[] words={"weferv","vfeverecr","regteg"};
	   String[] s=findWords(words);
	   for(String i:s){
		   System.out.println(i);
	   }
   }
	
	public static String[] findWords(String[] words) {
        if(words.length==0){
            return new String[0];
        }
       StringBuilder sb=new StringBuilder();
        for(String w:words){
            if(w.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")){
               
                sb.append(w+" ");
            }
        }
        
        String s=sb.toString();
        
        String[] s1=s.split(" ");
        
        return s1;
    }
}
