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
                if(arr[0] == 0) arr2[0]=1;
            for(int i=1;i<n;i++) {
                if(i-1>=0 && arr[i] == 0) {
                    arr2[i]=arr2[i-1]+1;
                }
            }
            int maxelt=0;
            for(int elt : arr2) maxelt=Math.max(maxelt,elt);
            System.out.println(maxelt);
        }
    }
}