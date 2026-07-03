import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            long ans = 0;
            List<Integer> list = new ArrayList<>();
            for(int i=1;i<=n;i++) {
                if(n%i == 0) list.add(i);
            }
            for(int elt : list) {
                long currmax = 0;
                long currmin = Long.MAX_VALUE;
                for(int i=0;i<n;i+=elt) {
                    long sum = 0;
                    for(int j=i;j<i+elt;j++) {
                        sum+=arr[j];
                    }
                    currmax = Math.max(currmax,sum);
                    currmin = Math.min(currmin,sum);
                }
                    ans = Math.max(ans,currmax-currmin);
            }
            System.out.println(ans); 
        }
    }
}