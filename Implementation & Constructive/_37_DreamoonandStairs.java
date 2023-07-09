import java.util.*;

public class _37_DreamoonandStairs {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = n / 2;
        if (n % 2 != 0) {
            ans = ans + 1;
        }
        boolean flag = false;
        while(ans<=n){
            if (ans % m == 0) {
                System.out.println(ans);
                flag = true;
                break;
            }
            ans = ans + 1;
        }
        if (flag == false) {
            System.out.println(-1);
        }
        sc.close();
    }
}