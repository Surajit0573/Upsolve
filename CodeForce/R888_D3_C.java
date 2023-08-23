import java.util.*;

public class R888_D3_C {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] c = new int[n];
            for (int i = 0; i < n; i++) {
                c[i] = sc.nextInt();
            }
            int first = 0;
            for (int i = 0; i < n; i++) {
                if (c[i] == c[0]) {
                    first++;

                }
            }
            if (first < k) {
                System.out.println("NO");
            } else if (c[0] == c[n - 1] && first >= k) {
                System.out.println("YES");
            } else {
                int end = 0;
                for (int j = n - 1; j >= 0 && end < k; j--) {
                    if (c[j] == c[n - 1]) {
                        end++;
                    }
                    if (c[j] == c[0]) {
                        first--;
                    }
                }
                if (first < k || end < k) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }

        }

        sc.close();
    }
}
