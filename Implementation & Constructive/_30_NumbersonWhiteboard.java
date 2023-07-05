import java.util.*;
public class _30_NumbersonWhiteboard{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
    int n=sc.nextInt();
    System.out.println(2);
   int r=n;
   for(int i=n-1;i>0;i--){
    System.out.println(r+" "+i);
    if((r+i)%2!=0){
      r=(r+i)/2+1 ;
    }else{
    r=(r+i)/2;
    }
   }
}
sc.close();
}
}