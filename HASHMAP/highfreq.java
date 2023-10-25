import java.util.*;
public class highfreq {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    HashMap<Character,Integer> map=new HashMap<>();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(map.containsKey(ch)){map.put(ch,map.get(ch)+1);}
        else map.put(ch,1);
    }
    Character mfc=s.charAt(0);
    for(char key:map.keySet()){
        if(map.get(key)>map.get(mfc)) mfc=key;
    }
    System.out.println(mfc +" "+map.get(mfc));
 }   
}
