import java.util.*;
public class Main
{
	public static int helper(String s1, String s2) {
		HashSet<Character>s11=new HashSet<>();
		HashSet<Character>s22=new HashSet<>();
		for(char ch : s1.toCharArray()) s11.add(ch);
		for(char ch : s2.toCharArray()) s22.add(ch);
		return s11.size() + s22.size();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0; t<T; t++) {
			int n = sc.nextInt();
			String str = sc.next();
			int pre[]=new int[n];
			int suff[]=new int[n];
			pre[0]=1;
			suff[n-1]=1;
			HashSet<Character> set=new HashSet<>();
			set.add(str.charAt(0));
			for(int i=1; i<n; i++) {
				if(!set.contains(str.charAt(i))) {
					set.add(str.charAt(i));
					pre[i]=pre[i-1]+1;
				}
				else pre[i]=pre[i-1];
			}
			set.clear();
			set.add(str.charAt(n-1));
			for(int i=n-2; i>=0; i--) {
				if(!set.contains(str.charAt(i))) {
					set.add(str.charAt(i));
					suff[i]=suff[i+1]+1;
				}
				else suff[i]=suff[i+1];
			}
			int distinctElt=0;
			for(int i=1; i<n; i++) {
				int elt1=pre[i-1];
				int elt2=suff[i];
				distinctElt=Math.max(distinctElt,(elt1+elt2));
			}
			System.out.println(distinctElt);
		}
	}
}
