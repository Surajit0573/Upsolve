import java.util.*;

public class _32_Kstring {

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        int n = s.length();
        if (n % k != 0) {
            System.out.println(-1);
            sc.close();
            return;
        }
        int[] f = new int[26];
        for (int i = 0; i < n; i++) {
            f[s.charAt(i) - 'a']++;
        }
        String ans = "";
        for (int i = 0; i < 26; i++) {
            if (f[i] != 0) {
                if (f[i] % k != 0) {
                    System.out.println(-1);
                    sc.close();
                    return;

                }
            }
        }

        while (ans.length() < n) {
            for (int i = 0; i < 26; i++) {
                if (f[i] != 0) {
                    int x = f[i] / k;
                    while (x-- > 0) {
                        char ch = (char) ('a' + i);
                        ans = ans + ch;
                        f[i]--;
                    }
                }
            }
            k--;
        }
        System.out.println(ans);
        sc.close();
    }
}