import java.util.*;
public class maxsub {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=scn.nextInt();
        }
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            sum=0;
            for(int j=i;j<a.length;j++){
           sum+=a[j];
             max=Math.max(sum,max);
            }
          
        }
        System.out.println(max);
    }
}
