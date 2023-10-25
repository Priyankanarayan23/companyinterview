import java.util.*;
class intro{

    public static void main (String args[]){
HashMap<String,Integer> map=new HashMap<>();
map.put("India",123);
map.put("china",143);
map.put("pak",189);
System.out.println(map);
map.put("pak",19); 
map.put("new york",19);// out of order (we cant prdict where it will put N.Y)
System.out.println(map);
System.out.println(map.get("pak"));
System.out.println(map.get(19));
System.out.println(map.containsKey("india"));
Set<String> key=map.keySet(); //made a set of keys
System.out.println(key);
for(String keys:map.keySet()){
    int val=map.get(keys);
    System.out.println(keys+" "+val);
}
    }
}