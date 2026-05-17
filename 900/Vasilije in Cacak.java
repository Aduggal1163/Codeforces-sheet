import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        for(int z=0;z<t;z++) {
            int n=sc.nextInt();
            long k=sc.nextLong();
            long x=sc.nextLong();
            boolean flag=false;
            long minSum = k * (k + 1) / 2;
            long maxSum = k * (2 * n - k + 1) / 2;
            if(minSum <= x && x <= maxSum) {
                flag = true;
            }
            if (flag) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}