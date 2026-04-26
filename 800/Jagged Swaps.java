import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int m=sc.nextInt();
	    for(int t=0;t<m;t++) {
	       int n=sc.nextInt();
	       int arr[]=new int[n];
           for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
           }
           if(arr[0] == 1) System.out.println("Yes");
           else 
                System.out.println("No");
            // for(int j=0;j<n;j++) {
            //     for(int i=1;i<n;i++) {
            //         if(i+1<n && arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
            //             int temp=arr[i];
            //             arr[i]=arr[i+1];
            //             arr[i+1]=temp;
            //         }
            //     }
            // }
            
            // boolean valid=true;
            // for(int i=0;i<n;i++) {
            //     if(i+1<n && arr[i]>arr[i+1]) {
            //         valid = false;
            //     }
            // }
            // if(!valid) System.out.println("No");
            // else System.out.println("Yes");
	    }
	}
}