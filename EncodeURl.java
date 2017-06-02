import java.util.HashMap;

public class EncodeURl {
	HashMap<Integer, String> map=new HashMap<Integer,String>();
	   int count=0;
	    // Encodes a URL to a shortened URL.
	    public String encode(String longUrl) {
	        count++;
	        map.put(count,longUrl);
	        
	        return "http://tinyurl.com/"+count;
	    }

	    // Decodes a shortened URL to its original URL.
	    public String decode(String shortUrl) {
	        int c=Integer.parseInt(shortUrl.replace("http://tinyurl.com/",""));
	        return map.get(c);
	    }
}
