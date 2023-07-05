import java.util.*;
public class _33_Game23{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
if(m%n!=0){
    System.out.println(-1);
    sc.close();
    return;
}int r=m/n;
int ans=0;
while(r%3==0){
    ans++;
    r=r/3;
}
while(r%2==0){
    ans++;
    r=r/2;
}
if(r==1){
    System.out.println(ans);
}else{
    System.out.println(-1);
}
sc.close();
}
}