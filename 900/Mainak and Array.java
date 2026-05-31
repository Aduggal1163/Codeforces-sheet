import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       for(int t=0;t<T;t++) {
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++) nums[i]=sc.nextInt();
        int ans=nums[n-1]-nums[0];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int elt : nums) {
            min=Math.min(min,elt);
            max=Math.max(max,elt);
        }
        ans=Math.max(ans,max-nums[0]);
        ans=Math.max(ans,nums[n-1]-min);
        for(int i=0;i<n-1;i++) {
            ans=Math.max(ans,nums[i]-nums[i+1]);
        }
        System.out.println(ans);
       } 
    }
}