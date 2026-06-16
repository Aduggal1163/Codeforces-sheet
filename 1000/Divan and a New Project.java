import java.util.*;
public class Main {
    static class Pair {
        long freq;
        int idx;
        Pair(long freq,int idx) {
            this.freq=freq;
            this.idx=idx;
        }
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t-->0) {
        int n=sc.nextInt();
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->Long.compare(b.freq,a.freq));
        for(int i=1;i<=n;i++) {
            pq.add(new Pair(sc.nextLong(),i));
        }
        long pos[]=new long[n+1];
        pos[0]=0;
        long ans = 0;
        long dist = 1;
        for(int i=0;i<n;i++) {
            Pair curr = pq.poll();
            long coordinates;
            if(i%2 == 0) coordinates = dist;
            else {
                coordinates = -dist;
                dist++;
            }
            pos[curr.idx] = coordinates;
            ans += 2L * curr.freq * Math.abs(coordinates);
        }
        System.out.println(ans);
        for(int i=0;i<=n;i++) {
            System.out.print(pos[i]+" ");
        }
        System.out.println();
       } 
    }
}