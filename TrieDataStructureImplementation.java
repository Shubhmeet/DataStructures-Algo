package datastructures;

import java.util.HashMap;

public class Trieexample1 {
	public static void main(String[] args) {
        Trie dict = new Trie();
        dict.insert("are");
        dict.insert("area");
        dict.insert("base");
        dict.insert("cat");
        dict.insert("cater");
        dict.insert("basement");

        String input = "caterer";
        System.out.print(input + ":   ");
        System.out.println(dict.getMatchingPrefix(input));              
 
        
	}
}
class TrieNode{
	public char val;
	public boolean isEnd;
	public HashMap<Character , TrieNode> children;
	TrieNode(char val){
		this.val=val;
		this.children=new HashMap<>();
		isEnd=false;
	}
	
	public char getval(){
		return val;
	}
	public HashMap<Character, TrieNode> getChildren(){
		return children;
	}
	public void setisEnd(boolean val){
		isEnd=val;
	}
	public boolean getisEnd(){
		return isEnd;
	}
	
}
class Trie{
	private TrieNode root;
	public Trie(){
		root=new TrieNode((char)0);
	}
	public void insert(String word){
		int length=word.length();
		TrieNode node=root;
		for(int level=0;level<length;level++){
			HashMap<Character, TrieNode> child=node.getChildren();
			char ch=word.charAt(level);
			if(child.containsKey(ch)){
				node=child.get(ch);
			}else{
				TrieNode temp=new TrieNode(ch);
				child.put(ch, temp);
				node=temp;
				
			}
		}
		node.setisEnd(true);
	}
	public String getMatchingPrefix(String input) {
		String result="";
		int length=input.length();
		TrieNode node=root;
		int prevMatch = 0;
		for(int level=0;level<length;level++){
			char ch = input.charAt(level);    
            HashMap<Character,TrieNode> child = node.getChildren();    
            if(child.containsKey(ch)){
            	result+=ch;
            	node=child.get(ch);
            	if(node.getisEnd()){
            		prevMatch=level;
            	}
            }else{
            	break;
            }
 
		}
		if(!node.getisEnd()){
			return input.substring(0,prevMatch+1);
		}
		return result;
	}
}