import java.util.*;
public class R892_D2_B{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
    int n=sc.nextInt();
   int[] arr=new int[n];
   int min=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
        int low=0;
        int high=0;
        int m=sc.nextInt();
        low=sc.nextInt();
        for(int j=1;j<m;j++){
            int mi=sc.nextInt();
            if(mi<=low){
                high=low;
                low=mi;

            }
            else if(mi<high||high ==0){
                high=mi;
            }
        }
       min=Math.min(min,low);
        arr[i]=high;
    }
    long ans=0;
    Arrays.sort(arr);
    for(int i=0;i<n-1;i++){
        ans+=arr[n-1-i];
    }
    System.out.println(ans+min);
}
sc.close();
}
}