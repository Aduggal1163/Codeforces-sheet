import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int z=0;z<t;z++) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
            }
            if(arr[0]==1) arr[0]=arr[0]+1;
            for(int i=1;i<n;i++) {
                if(arr[i]==1) arr[i]++;
                if(arr[i]%arr[i-1]==0) arr[i]=arr[i]+1;
            }
            for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
            System.out.println();
        }
    }
}