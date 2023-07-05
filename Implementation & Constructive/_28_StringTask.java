import java.util.*;
public class _28_StringTask{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.next();
s=s.toLowerCase();
for(int i=0;i<s.length();i++){
    //Vowels
    if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='y'){
        s=s.substring(0,i)+s.substring(i+1);
        i--;
    }
    //consonants
    else{
        s=s.substring(0,i)+"."+s.substring(i);
        i++;
    }
}
System.out.println(s);
sc.close();
}
}
