import java.util.*;
public class Main {
	static class Pair {
		long ele;
		int idx;
		Pair(long ele, int idx) {
			this.ele=ele;
			this.idx=idx;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0; t<T; t++) {
			int n=sc.nextInt();
			long k=sc.nextLong();
			PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)-> {
				if(a.ele == b.ele) return a.idx-b.idx;
				return Long.compare(b.ele,a.ele);
			});
			for(int i=0; i<n; i++) {
				long elt = sc.nextInt();
                long rem = elt % k;
                if(rem == 0) rem = k; 
                pq.add(new Pair(rem,i+1));
			}
			while(pq.size()>0) {
				Pair p = pq.poll();
				long elt = p.ele;
				int i = p.idx;
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}