import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int t=0;t<n;t++) {
	        int m=sc.nextInt();
	        int k=sc.nextInt();
	        int arr[]=new int[m];
	        for(int s=0;s<m;s++) {
	            arr[s]=sc.nextInt();
	        }
	        boolean valid=true;
	        if(k>=2) {
	            valid=true;
	        }
	        else {
	            for(int i=0;i<m;i++) {
	                if(i+1<m && arr[i] > arr[i+1]) valid=false;
	            }
	        }
	        if(valid) System.out.println("YES");
	        else System.out.println("NO");
	    }
	}
}