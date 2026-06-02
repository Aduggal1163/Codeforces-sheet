import java.util.*;
public class Main {
	public static int helper(String s, int cnt0, int cnt1) {
		if(cnt0==cnt1) return 0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == '1') {
				if(cnt0>0) {
					cnt0--;
					// p=p+'0';
				}
				else {
					// cnt1--;
					// p=p+'1';
					return cnt1;
				}
			}
			else {
				if(cnt1>0) {
					cnt1--;
					// p=p+'1';
				}
				else {
					// cnt0--;
					// p=p+'0';
					return cnt0;
				}
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0; t<T; t++) {
			String s = sc.next();
			int cnt0=0;
			int cnt1=0;
			for(char ch : s.toCharArray()) {
				if(ch == '0') cnt0++;
				else cnt1++;
			}
			System.out.println(helper(s,cnt0,cnt1));
			// for(int i=0;i<s.length();i++) {
			//     if(s.charAt(i) == p.charAt(i)) cnt++;
			// }
			// System.out.println(cnt);
		}
	}
}