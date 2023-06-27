import java.util.*;
public class _20_CplusEqual{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int a=sc.nextInt();
int b=sc.nextInt();
int n=sc.nextInt();
if(a>b){
    int temp=a;
    a=b;
    
    b=temp;
}
int i=0;
while(a<=n&&b<=n){
    a+=b;
    i++;
    if(a<=n){
    b+=a;
    i++;
    }
}
System.out.println(i);
}
sc.close();
}
}