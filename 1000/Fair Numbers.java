import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0) {
            long n=sc.nextLong();
            boolean valid = false;
            long no = n;
            long ans = no;
            while(!valid) {
                long m = no;
                while(m > 0) {
                    int ld = (int)(m %10);
                    if(ld != 0 && no % ld != 0) break;
                    else m/=10;
                }
                if (m == 0) {
                    valid = true;
                    ans = no;
                }
                no++;
            }
            System.out.println(ans);
        }
    }
}