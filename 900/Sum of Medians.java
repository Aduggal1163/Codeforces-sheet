import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int m = n * k;
            int[] arr = new int[m];
            for (int i = 0; i < m; i++) {
                arr[i] = sc.nextInt();
            }
            long sum=0;
            int take = n/2+1;
            int idx=m-take;
            for(int i=0;i<k;i++) {
                sum+=arr[idx];
                idx-=take;
            }
            System.out.println(sum);
            
        }
    }

}
