import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            long a=sc.nextLong();
            long b = sc.nextLong();
            long big = Math.max(a,b);
            long small = Math.min(a,b);
            if(big % small != 0) {
                System.out.println(-1);
                continue;
            }
            int cnt = 0;
            long ratio = big/small;
            while(ratio % 2 == 0) {
                ratio/=2;
                cnt++;
            }
            if(ratio != 1) {
                System.out.println(-1);
            }
            else {
                long ans = cnt/3;
                if(cnt % 3 != 0) {
                   ans++;
                }
            System.out.println(ans);
            }

        }
    }
}




