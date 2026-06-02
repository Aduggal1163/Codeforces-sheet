import java.util.*;
public class Main {
	public static int helper(int n, int k, int[] arr) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            int val = arr[i];
            int op=0;
            while(val % k != 0) {
                op++;
                val++;
            }
            ans=Math.min(ans,op);
        }
        return ans;
	}
    public static int helper4(int n, int k, int[] arr) {
        int ans = Integer.MAX_VALUE;
        for(int elt : arr) {
            if(elt % 4 == 0) return 0;
        }
        for(int i=0;i<n;i++) {
            int val = arr[i];
            int op=0;
            while(val % k != 0) {
                op++;
                val++;
            }
            ans=Math.min(ans,op);
        }
        int even = 0;
        for(int elt : arr) {
            if(elt % 2 == 0) even ++;
        }
        int te = 0;
        if(even >= 2) te = 0;
        else if(even == 1) te=1;
        else te=2;
        return Math.min(ans,te);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0; t<T; t++) {
			int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
			for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            int ans=0;
            if(k != 4)ans = helper(n,k,arr);
            else ans = helper4(n,k,arr);
			System.out.println(ans);
		}
	}
}