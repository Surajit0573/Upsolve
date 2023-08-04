import java.util.*;

public class R888_D3_B {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int[] nums = new int[n];
            int[] sort = new int[n];
            for (int i = 0; i < n; i++) {
                sort[i] = nums[i] = sc.nextInt();

            }
            Arrays.sort(sort);
            boolean flag=true;
            for(int i=0;i<n;i++){
                int diff=Math.abs(nums[i]-sort[i]);
                if(diff%2!=0){
                    System.out.println("NO");
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println("YES");
            }

        }
        sc.close();
    }
}