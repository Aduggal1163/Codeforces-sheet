import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0; t<T; t++) {
			int n=sc.nextInt();
			char c = sc.next().charAt(0);
			String s = sc.next();
			s=s+s;
			if (c == 'g') {
				System.out.println(0);
				continue;
			}
			List<Integer> cs=new ArrayList<>();
			List<Integer> greens=new ArrayList<>();
			for(int i=0; i<s.length()/2; i++) {
				if(s.charAt(i) == c) cs.add(i+1);
			}
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i) == 'g') greens.add(i+1);
			}
			int i=0;
			int j=0;
			int dist=0;
			// System.out.println(cs+" "+greens);
			while(i<cs.size() && j<greens.size()) {
				if(cs.get(i) < greens.get(j)) {
					dist=Math.max(dist,(greens.get(j)-cs.get(i)));
					i++;
					// j++;
				}
				else j++;
			}
			System.out.println(dist);
		}
	}
}