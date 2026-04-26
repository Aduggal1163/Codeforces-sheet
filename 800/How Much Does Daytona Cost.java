import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int z=0;z<t;z++) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
            }
            boolean valid = false;
            for(int elt : arr) {
                if(elt == k) {
                    valid=true;
                    break;
                }
            }
            if(valid) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}