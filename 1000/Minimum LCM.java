import java.util.*;
public class Main
{
	public static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b,a%b);
	}
	public static int lcm(int a, int b) {
		return (a*b)/gcd(a,b);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0; t<T; t++) {
			long n=sc.nextLong();
			if(n%2 == 0) {
				System.out.println(n/2+" "+n/2);
				continue;
			}
			long spf = n;
			for(long i=3; i*i<=n; i+=2) {
				if(n%i == 0) {
					spf=i;
					break;
				}
			}
			if(spf == n) {
				System.out.println("1"+" "+(n-1));
			}
			else {
				long d = n/spf;
				System.out.println(d+" "+(n-d));

			}
		}
	}
}
