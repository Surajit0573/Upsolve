import java.util.*;

public class R886_D4_F {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t-- > 0) {
         int n = sc.nextInt();
         HashMap<Long, Integer> frogs = new HashMap<>();// <hop,number of frogs with same length of hop>
         for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            frogs.put(a, frogs.getOrDefault(a, 0) + 1);
         }
         Set<Long> keys=frogs.keySet();
         HashMap<Integer, Integer> hm = new HashMap<>();// <position,frequency>
         for (long k:keys) {
            if (k <= n) {
               int x = 2;
               int curr = (int) k;
               while (curr <= n) {
                  hm.put(curr, hm.getOrDefault(curr, 0) + frogs.get(k));
                  curr = (int) k * x;
                  x++;
               }
            }
         }
         int ans = 0;
         Set<Integer> key = hm.keySet();
         for (Integer k : key) {
            ans = Math.max(ans, hm.get(k));
         }
         System.out.println(ans);
      }
      sc.close();
   }
}