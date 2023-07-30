import java.util.*;

public class ER152_D2_B {
   public static class pair implements Comparable<pair> {
      int idx;
      int health;

      pair(int i, int h) {
         this.health = h;
         this.idx = i;
      }

      public int compareTo(pair p) {
         if (p.health == this.health) {
            return this.idx - p.idx;
         } else {
            return p.health - this.health;
         }
      }
   }

   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t-- > 0) {
         int n = sc.nextInt();
         int k = sc.nextInt();
         PriorityQueue<pair> pq = new PriorityQueue<>();
         ArrayList<Integer>ans=new ArrayList<>();
         for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            a=a%k;
            if(a>0){
            pq.add(new pair(i, a));
            }else{
                ans.add(i);
            }
         }
         for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
         }
         while(!pq.isEmpty()){
            pair curr=pq.remove();
            curr.health-=k;
            if(curr.health>0){
               pq.add(curr);
            }else{
               System.out.println(curr.idx);
            }
         }
      }

      sc.close();
   }
}