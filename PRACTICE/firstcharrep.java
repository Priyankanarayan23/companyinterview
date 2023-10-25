import java.util.*;
public class firstcharrep {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        int flag=0;
        for(int i=0;i<str.length();i++){
           
             
                if(str.charAt(i)==(str.charAt(i+1))) {
                    char c=str.charAt(i);
                System.out.println(c);
                
                    break;
                    
                }
             
            
        }
    }
}
