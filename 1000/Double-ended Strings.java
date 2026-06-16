import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0) {
			String a = sc.next();
			String b = sc.next();
			int cnt = 0;
			int m = a.length();
			int n = b.length();
            int maxlen = 0;
			for(int i=0;i<m;i++) {
                for(int j=0;j<n;j++) {
                    int len = 0;
                    int x = i;
                    int y = j;
                    while(x<m && y< n && a.charAt(x) == b.charAt(y)) {
                        len ++;
                        x++;
                        y++;
                    }
                    if(len >= maxlen) {
                    maxlen = len;
                    cnt = (Math.abs(len - m)) + (Math.abs(len-n));
                                                                            }
                }
                
            }
            System.out.println(cnt);
		}
	}
}