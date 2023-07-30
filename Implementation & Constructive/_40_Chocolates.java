import java.util.*;
public class _40_Chocolates{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
long[] a=new long[n];
for(int i=0;i<n;i++){
    a[i]=sc.nextLong();
}long ans=a[n-1];
long curr=ans;
for(int i=n-2;i>=0;i--){
    if(a[i]<curr){
        curr=a[i];
    }
    else if(curr>0){

        curr=curr-1;
    }
    ans+=curr;
}
System.out.println(ans);
sc.close();
}
}
