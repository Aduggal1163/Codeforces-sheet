import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int z=0;z<t;z++) {
            long a=sc.nextInt();
            long b=sc.nextInt();
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i = 0; i<n; i++) {
                arr[i]=sc.nextInt();
            }
            long time = b;
            for(int elt : arr) {
                if(elt < a) {
                    time+=elt;
                }
                else time+=a-1;
            }
            System.out.println(time);
        }
    }
}