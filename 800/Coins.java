import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int z=0;z<t;z++) {
            long n=sc.nextLong();
            long k=sc.nextLong();
            if(n % 2 == 0) System.out.println("Yes");
            else {
                if (k % 2 == 0) System.out.println("No");
                else {
                    if (n >= k) System.out.println("Yes");
                    else System.out.println("No");
                }
            }
        }
    }
}