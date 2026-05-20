import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int z=0;z<t;z++) {
            int n=sc.nextInt();
            int q=sc.nextInt();
            int arr[]=new int[n];
            long pre[]=new long[n];
            for(int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
            }
            pre[0]=arr[0];
            for(int i=1;i<n;i++) {
                pre[i]=pre[i-1]+arr[i];
            }
            long totalsum=pre[n-1];
            for(int y=0;y<q;y++) {
                int l=sc.nextInt();
                int r=sc.nextInt();
                int k=sc.nextInt();
                long presum = 0;
                if (l == 1) presum = pre[r-1];
                else
                  presum = pre[r-1] - pre[l-2];
                long dupsum = totalsum;
                dupsum = dupsum - presum + ((long)(r-l+1) * k);
                if(dupsum % 2 != 0) System.out.println("Yes");
                else System.out.println("No");
            }
        }
    }
}