import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++) {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            int min=arr[0]-x;
            int max=arr[0]+x;
            int change = 0;
            for(int i=1;i<n;i++) {
                int cmin = arr[i] - x;
                int cmax = arr[i] + x;
                min=Math.max(min,cmin);
                max=Math.min(max,cmax);
                if(min>max) {
                    change ++;
                    max = cmax;
                    min = cmin;
                }
            }            
            System.out.println(change);
        }
    }
}
