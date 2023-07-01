import java.util.*;

public class _23_CubePyramids {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        {
        int n = s.nextInt();
        int i = 1;
        int x = 0;
        for (; i <= n; i++) {
            x = x + (i * (i + 1)) / 2;
            if (x > n) {
                break;
            }
        }
        System.out.println(i - 1);
    }

        s.close();
    }
}
