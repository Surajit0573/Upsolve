import java.util.*;
public class _38_NewYearTransportation{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int t=sc.nextInt();
int[] a=new int[n];
for(int i=1;i<n;i++){
    a[i]=sc.nextInt();
}
int curr=1;
while(curr<t){
    curr=curr+a[curr];
    if(curr==t){
        System.out.println("YES");
        sc.close();
        return;
    }
}
System.out.println("NO");
sc.close();
}
}
