import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            int moves=0;
            boolean possible = true;
            for(int i=n-2;i>=0;i--) {
                while(arr[i] >= arr[i+1] && arr[i] > 0) {
                    arr[i]=arr[i]/2;
                    moves++;
                }
                if(arr[i]>=arr[i+1]) {
                    possible=false;
                }
            }
            if (possible)System.out.println(moves);
            else System.out.println(-1);
        }
    }
}