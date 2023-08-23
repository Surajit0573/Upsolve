import java.util.*;

public class R893_D2_C {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            HashSet<Integer> hs = new HashSet<>();
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(1);
            hs.add(1);
            for (int i = 2; i <= n; i++) {
                if (!hs.contains(i)) {
                    ans.add(i);
                    hs.add(i);
                    int k = i * 2;
                    while (k <= n) {
                        ans.add(k);
                        hs.add(k);
                        k=k*2;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(ans.get(i) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}