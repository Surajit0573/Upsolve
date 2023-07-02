import java.util.*;
public class _27_FixYou{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
    int n=sc.nextInt();
    int m=sc.nextInt();
    int count=0;
    for(int i=0;i<n;i++){
        String s=sc.next();
        for(int j=0;j<m;j++){
            if(i!=n-1&&j==m-1&&s.charAt(j)=='R'){
                count++;
            }
            if(i==n-1&&j!=m-1&&s.charAt(j)=='D'){
                count++;
            }
        }
    }
    System.out.println(count);
}
sc.close();
}
}