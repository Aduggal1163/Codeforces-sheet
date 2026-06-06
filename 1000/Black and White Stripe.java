import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0; t<T; t++) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			String s=sc.next();
			int wc=0;
			for(int idx = 0; idx<=k-1; idx++) {
				char ch = s.charAt(idx);
				if(ch == 'W') wc++;
			}
			int idx=0;
			int cwc = wc;
			for(int i=k; i<n; i++) {
				char ch2=s.charAt(i);
				char ch1=s.charAt(idx++);
				if(ch1 == 'W' && ch2 == 'B') cwc --;
				else if(ch1 == 'B' && ch2 == 'W') cwc ++;
				wc = Math.min(wc,cwc);
			}
			System.out.println(wc);
		}
	}
}