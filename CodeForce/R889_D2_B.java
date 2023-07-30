import java.util.*;
public class R889_D2_B{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
    long n=sc.nextLong();
    int ans=0;
    for(int i=1;;i++){
        if(n%i==0){
            ans++;
        }else{
            break;
        }
    }
    System.out.println(ans);
}
sc.close();
}
}