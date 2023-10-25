import java.util.*;
public class nonrep {
    public static void main(String[] args) {
        String s="abcabcbb";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                String ss=s.substring(i, j);
        if(check(ss).equals(true)){
            System.out.println(ss);
        }

    }
   
}}
 public static Boolean check(s){
     for(int m=0;m<s.length();m++){
            for(int j=i+1;j<s.length();j++){
if(s.charAt(m)==s.charAt(j)) return false;
            }}
            return true;
    }}
