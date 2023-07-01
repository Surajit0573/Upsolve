import java.util.*;

public class _24_BoringApartment {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
        int x=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<(x%10)){
            sum+=10;
            i++;
        }
        int q=1;
        while(x>0){
            sum+=q;
            q++;
            x=x/10;
        }
        System.out.println(sum);
      }
        sc.close();
    }
}