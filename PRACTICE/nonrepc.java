import java.util.*;
public class nonrepc {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(map.containsKey(c)) map.put(c,map.get(c)+1);
            else map.put(c,1);
        }
       for(int i=0;i<str.length();i++){
        char c=str.charAt(i);
        if(map.get(c)==1) {System.out.println(c);
        break;}
       }

    }
}
