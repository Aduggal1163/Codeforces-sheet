import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            int arr1[]=new int[n];
            int arr2[]=new int[n];
            for(int i=0;i<n;i++) arr1[i]=sc.nextInt();
            for(int i=0;i<n;i++) arr2[i]=sc.nextInt();
            int l=0;
            int r=0;
            for(int i=0;i<n;i++) {
                if(arr1[i] != arr2[i]) {
                    l=i;
                    break;
                }
            }
            for(int i=n-1;i>=0;i--) {
                if(arr1[i] != arr2[i]) {
                    r=i;
                    break;
                }
            }
            while(l>0 && arr2[l] >= arr2[l-1]) l--;
            while(r<n-1 && arr2[r] <= arr2[r+1]) r++;
            System.out.println((l+1)+" "+(r+1));
        }
    }
}