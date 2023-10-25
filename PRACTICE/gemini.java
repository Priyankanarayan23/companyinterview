import java.util.HashMap;

public class gemini {
   public static void main(String[] args) {
    String s1="beat";
    String s2="Seal";
    int count=0;
    HashMap<Character,Integer>map=new HashMap<>();
    for(int i=0;i<s1.length();i++){
        char c=s1.charAt(i);
        if(map.containsKey(c))map.put(c,map.get(c)+1);
        else map.put(c,1);
    }

 for(int i=0;i<s2.length();i++){
        char c=s2.charAt(i);
        if(!map.containsKey(c)) count++;
        } 
        System.out.println(count);
}}
