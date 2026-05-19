import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int z=0;z<t;z++) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            Arrays.sort(arr);
            int maxcnt=0;
            int curcnt=0;
            for(int i=1;i<n;i++) {
                if((arr[i]-arr[i-1]) <= k) {
                    curcnt++;
                }
                else curcnt=0;
                maxcnt=Math.max(maxcnt,curcnt);
            }
            maxcnt=Math.max(maxcnt,curcnt);
            // System.out.println(maxcnt);
            System.out.println(n-maxcnt-1);
        }
    }
}