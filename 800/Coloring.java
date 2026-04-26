import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int z=0;z<t;z++) {
            int n = sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
            }
            int nOdd = 0;
            for(int elt : arr) if (elt % 2 != 0) nOdd++;
            if(nOdd % 2 == 0) System.out.println("yes");
            else System.out.println("no");
        }
    }
}