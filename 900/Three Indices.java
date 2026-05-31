import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++) {
            int n = sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            boolean found=false;
            for(int i=0;i<n;i++) {
                int left = -1;
                int right=-1;
                for(int j=0;j<i;j++) {
                    if(arr[i]>arr[j]) {
                        left = j+1;
                    }
                } 
                for(int k=i;k<n;k++) {
                    if(arr[k] < arr[i]) {
                        right=k+1;
                    }
                }
                if(right != -1 && left !=-1) {
                    System.out.println("Yes");
                    System.out.println(left+" "+ (i+1) +" "+right);
                    found = true;
                    break;
                }
            }
            if(!found) {
                System.out.println("No");
            }
        } 
    }
}