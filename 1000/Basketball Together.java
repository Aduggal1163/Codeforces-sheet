import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++) arr[i]=sc.nextInt();
		int i=0;
		int j=n-1;
		int cnt=0;
		Arrays.sort(arr);
		int cursum=0;
		while(i<j) {
			cursum += arr[j];
            if(cursum > k) {
                cursum = 0;
                cnt++;
                j--;
            }
			else if(arr[j] + cursum > k) {
				cnt++;
				j--;
                i++;
				cursum = 0;
			}
			else i++;
		}
        if(i==0 && j==0 && arr[j] > k) cnt++;
		System.out.println(cnt);
	}
}