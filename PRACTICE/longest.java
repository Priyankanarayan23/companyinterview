import java.util.*;
class longest{
public static void main(String[] args) {
    String s="abcabcbb";
    int count=0,max=Integer.MIN_VALUE;
    for(int i=0;i<s.length();i++){
        count=0;
        for(int j=i+1;j<s.length();j++){
s.substring(i,j);
count=j-i;
max=Math.max(count,max);
        }
    }
    System.out.println(max);
}
}