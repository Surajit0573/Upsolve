import java.util.*;
public class _36_Buttons{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int ans=n;
int buttonleft=n-1;
for(int i=1;i<=n-1;i++){
    ans=ans+(buttonleft+((buttonleft-1)*i));
    buttonleft--;
}
System.out.println(ans);
sc.close();
}
}