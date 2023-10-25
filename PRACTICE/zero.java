public class zero {
  public static void main(String[] args) {
      int arr[]=new int[]{2 ,3 ,-1 ,2, 4 ,5 ,-4 ,-6, 10 ,20, -5 ,-5 ,-10};
      int sum=0,d=0,count=0,m=0,max=Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++){
          sum=0;
          count=0;
          for(int j=i;j<arr.length;j++){
            sum+=arr[j];
            count++;
           
            if(sum==0){
  max=Math.max(max,count);
              if(max==count){d=i;
              m=j;}
            }
          }
      }
      for(int i=d;i<=m;i++){
          System.out.println(arr[i]);
      }
  }
}

