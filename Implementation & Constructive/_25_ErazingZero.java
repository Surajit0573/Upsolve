import java.util.*;

public class _25_ErazingZero {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int left = 0;
            int right = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    left = i;
                    break;
                }
            }
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == '1') {
                    right = i;
                    break;
                }
            }
            int count = 0;
            for (int i = left; i < right; i++) {
                if (s.charAt(i) == '0') {
                    count++;

                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
