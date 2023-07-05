import java.util.*;
public class _31_PetrandBook{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] w=new int[7];
for(int i=0;i<7;i++){
    w[i]=sc.nextInt();
}int pages=0;
int i=0;
while(pages<n){
    for(i=0;i<7;i++){
        pages=pages+w[i];
        if(pages>=n){
            break;
        }
    }
}
System.out.println((i+1));
sc.close();
}
}