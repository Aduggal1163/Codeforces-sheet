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
            int arr2[]=new int[n];
            for(int i=0;i<n;i++) {
                arr2[i] = n+1-arr[i];
            }
            for(int elt : arr2) {
                System.out.print(elt+" ");
            }
            System.out.println();
        }
    }
}