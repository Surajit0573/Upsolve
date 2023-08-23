import java.util.*;
public class ER150_D2_B{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
    int q=sc.nextInt();
    ArrayList<Integer>arr=new ArrayList<>();
    String s="1";
    int a=sc.nextInt();
    arr.add(a);
    boolean flag=true;
    int curr=a;
    if(q>1){
        for(int i=1;i<q;i++){
            int qi=sc.nextInt();
            if(flag&&qi>=curr){
                arr.add(qi);
                s+="1";
                curr=qi;
            }
            else if(qi>=curr&&qi<=arr.get(0)){
                arr.add(qi);
                s+="1";
                curr=qi;
            }
            else if(flag&&qi<=arr.get(0)){
                flag=false;
                arr.add(qi);
                s+="1";
                 curr=qi;
            }
            else{
                s+="0";
            }
        }
    }
    System.out.println(s);
}
sc.close();
}
}