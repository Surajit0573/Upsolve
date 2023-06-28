import java.util.*;

public class _21_maxIncreseing{

  
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int[] a=new int[n];
      for(int i=0;i<n;i++){
         a[i]=sc.nextInt();
      }
      int max=1;
      int curr=1;
      for(int i=1;i<n;i++){
         if(a[i]>a[i-1]){
            curr++;
         }else{
            curr=1;
         }
         max=Math.max(curr,max);
      }
      System.out.println(max);
      sc.close();
   }
}        