import java.util.*;
public class _34_PresentfromLena{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<=n;i++){
    for(int k=0;k<n-i;k++){
    System.out.print("  ");
    }
    if(i==0){
    System.out.println(0);
    continue;
    }
    for(int j=0;j<=i;j++){
        System.out.print(j+" ");
    }
    for(int j=i-1;j>0;j--){
        System.out.print(j+" ");
    }
    System.out.print(0);
    System.out.println();
}
for(int i=n-1;i>=0;i--){
    for(int k=0;k<n-i;k++){
    System.out.print("  ");
    }
    if(i==0){
    System.out.println(0);
    continue;
    }
    for(int j=0;j<=i;j++){
        System.out.print(j+" ");
    }
    for(int j=i-1;j>0;j--){
        System.out.print(j+" ");
    }
    System.out.print(0);
    System.out.println();
}
sc.close();
}
}