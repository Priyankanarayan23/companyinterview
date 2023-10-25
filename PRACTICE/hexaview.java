public class hexaview {
    public static void main(String[] args) {
        String s="India has to face this consequence";
        String[] str=s.split(" ");
        int idx=0,max=Integer.MIN_VALUE;
         for(int i=0;i<str.length;i++){
       max=Math.max(max,str.length);
        if(max==str.length) idx=i;
         }
         System.out.println(str[idx]);
        
    }
}
