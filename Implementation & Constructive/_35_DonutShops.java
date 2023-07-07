import java.util.*;
public class  _35_DonutShops{
    
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
    long a=sc.nextInt();
    long b=sc.nextInt();
    long c=sc.nextInt();
    if(a<c){
        System.out.println(1);
    }else{
        System.out.println(-1);
    }
    if((b*a)>c){
        System.out.println(b);
    }else{
        System.out.println(-1);
    }
}
sc.close();
}
}