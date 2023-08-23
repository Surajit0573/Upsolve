import java.util.*;
public class R892_D2_C{

    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
    int n=sc.nextInt();
    int ans=0;
    for(int i=1;i<=n;i++){
        int sum=0;
        int max=0;
        if(i>1){
        for(int j=1;j<i;j++){
            int curr=(int)Math.pow(j,2);
            sum+=curr;
            max=Math.max(max,curr);
        }
    }
    if(i<n){
        for(int j=i,k=n;j<=n;j++,k--){
            int curr=j*k;
             sum+=curr;
            max=Math.max(max,curr);
        }
    }
        sum=sum-max;
        ans=Math.max(ans,sum);
    }
    System.out.println(ans);
}
sc.close();
}
}
