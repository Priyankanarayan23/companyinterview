import java.util.*;
public class commonarr{
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
     
         System.out.println("enter a1 ele");
             int n1=s.nextInt();
             
         int arr1[]=new int[n1];
          for(int i=0;i<arr1.length;i++){
arr1[i]=s.nextInt();
    }  
    System.out.println("enter a2 ele");
    int n2=s.nextInt();
   
    int arr2[]=new int[n2];
 for(int i=0;i<arr2.length;i++){
arr2[i]=s.nextInt();
    }

    HashMap<Integer,Integer>map=new HashMap<>();
for(int i:arr1){
    if(map.containsKey(i)) map.put(i,map.get(i)+1);
    else map.put(i,1);
}
String ans=" ";
for(int i:arr2){
    if(map.containsKey(i)) {
        ans+=i;
        map.remove(i);
  
    }
    
}
System.out.println(ans);

    }
   
}

