import java.util.*;
public class R886_D4_E{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
Long n=sc.nextLong();
 long c =sc.nextLong();
 long sum=0;
 long sq=0; 
 for(int i=0;i<n;i++){
Long s=sc.nextLong();
sum+=s;
sq+=(s*s);
 }
 long B=sum/n;
 long Cc=c-sq;
 Cc=Cc/(4*n);
 long B2=B*B/4;
 long left=(long)Math.sqrt(B2+Cc);
 long ans=left-(B/2);
 System.out.println(ans);
}
 
 sc.close();
}
}