import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        String s="abcabcbb";

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                String ss=s.substring(i, j);
                if(ispali(ss)==true){
                    System.out.println(ss);
                }
            }
        }
       
    }
     public static boolean ispali(String s){
            int i=0,j=s.length()-1;
            while(i<=j){
                if(s.charAt(i)!=s.charAt(j)) return false;
                i++;
                j--;
            }
            return true;
        }
}
