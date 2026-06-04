import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0; t<T; t++) {
			int n=sc.nextInt();
			int globalFirstMin=Integer.MAX_VALUE;
			int globalSecondMin=Integer.MAX_VALUE;
			long sumSecondMin=0;
			for(int i=0; i<n; i++) {
			    int m=sc.nextInt();
				int arr[] = new int[m];
				for(int j=0; j<m; j++) {
					arr[j]=sc.nextInt();
				}
				Arrays.sort(arr);
				int mn1=arr[0];
				int mn2=arr[1];
				sumSecondMin+=mn2;
				globalFirstMin=Math.min(globalFirstMin,mn1);
				globalSecondMin=Math.min(globalSecondMin,mn2);
			}
        System.out.println(globalFirstMin + sumSecondMin - globalSecondMin);
		}
	}
}