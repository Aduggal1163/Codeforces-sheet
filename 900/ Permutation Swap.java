import java.util.*;
public class Main {
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
            }
            int ans=0;
            for(int i=0;i<n;i++) {
                int d = Math.abs((i+1) - arr[i]);
                if(d!=0) ans=gcd(ans,d);
            }
            System.out.println(ans);
        }
    }
}