import java.util.*;
public class _26_RepeatingCipher{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String s=sc.next();
StringBuilder ans=new StringBuilder("");
int m=1;
for(int i=0;i<n;i+=m){
ans.append(s.charAt(i));
m++;
}
System.out.println(ans);
sc.close();
}
}
