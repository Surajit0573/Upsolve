import java.util.*;
public class _41_CityDay{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int x=sc.nextInt();
int y=sc.nextInt();
int min=Integer.MAX_VALUE;
int count=0;
int ans=0;
int curr=0;
for(int i=0;i<n;i++){
    int a=sc.nextInt();
    if(ans==0){
    if(a<min){
        min=a;
        curr=i+1;
        count=0;
    }else{
        count++;
    }
    if(count==y){
            ans=curr;
        }
    if(i==n-1){
        ans=curr;
    }
}
}
System.out.println(ans);
sc.close();
}
}