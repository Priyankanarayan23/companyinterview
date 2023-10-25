import java.util.*;
public class givensum {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        int sum=0,count=0;
        for(int i=0;i<a.length;i++){
            sum=0;
            for(int j=i;j<a.length;j++){
           sum+=a[j];
           if(sum==k) count++;
            }
          
        }
    System.out.println(count);
    }
}