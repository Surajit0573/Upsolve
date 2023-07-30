import java.util.*;

public class R887_D2_C {
   
    //Time Limit Exceeded - test case 3
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] delete=new int[n];
            for(int i=0;i<n;i++){
                delete[i]=sc.nextInt();
            }
            ArrayList<Long>arr=new ArrayList<>();
            for(long i=1;i<=delete[n-1];i++){
                arr.add(i);
            }
            long max=delete[n-1];
            while(k-->0){
                for(int i=0;i<n;i++){
                    arr.remove(delete[i]-1);
                }
                while(arr.size()<delete[n-1]+1){
                    arr.add(++max);
                }
            }
            System.out.println(arr.get(0));
        }

        sc.close();
    }
}