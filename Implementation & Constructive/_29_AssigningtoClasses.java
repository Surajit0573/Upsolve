import java.util.*;
public class _29_AssigningtoClasses{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
    int n=sc.nextInt();
    int[] a=new int[2*n];
    for(int i=0;i<2*n;i++){
        a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    int ans=a[n]-a[n-1];
    System.out.println(ans);
}
sc.close();
}
}