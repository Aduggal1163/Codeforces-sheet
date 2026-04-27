import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        for(int z=0;z<t;z++) {
            int n = sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
            }
            int minus = 0;
            int plus = 0;
            for(int elt : arr) {
                if(elt == -1) minus++;
                else plus++;
            }
            int k = Math.max(0, minus - n/2);
            int ans = k + ((minus - k) % 2);
            System.out.println(ans);
        }
    }
}