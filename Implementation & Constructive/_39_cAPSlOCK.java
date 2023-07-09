import java.util.*;
public class _39_cAPSlOCK{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.next();
String body=s.substring(1);
String head=s.substring(0, 1);
for(int i=0;i<body.length();i++){
    if(body.charAt(i)-'A'>25){
        System.out.println(s);
        sc.close();
        return;
    }
}
if(head.charAt(0)-'A'<26){
    head=head.toLowerCase();
}else{
    head=head.toUpperCase();
}
body=body.toLowerCase();
System.out.println(head+body);
sc.close();
}
}