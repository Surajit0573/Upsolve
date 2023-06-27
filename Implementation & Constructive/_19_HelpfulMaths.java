import java.util.*;

public class _19_HelpfulMaths{

  
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String s=sc.next();
      int one=0;
      int two=0;
      int three=0;
      for(int i=0;i<s.length();i=i+2){
         int j=s.charAt(i)-'0';
         if(j==1){
            one++;
         }
         else if(j==2){
            two++;
         }else{
            three++;
         }
      }
      boolean t=false;
      boolean th=false;
      if(two>0)t=true;
      if(three>0)th=true;
      if(th){
      while(one-->0){
         System.out.print("1+");
      }
      while(two-->0){
         System.out.print("2+");
      }
      while(three-->1){
         System.out.print("3+");
      }
      System.out.print("3");
   }else if(t){
      while(one-->0){
         System.out.print("1+");
      }
      while(two-->1){
         System.out.print("2+");
      }
      System.out.print("2");
   }
   else{
      System.out.print(s);
   }
      sc.close();
   }
}     