import java.util.*;
public class Main {
    static class Pair{
        int elt;
        int idx;
        Pair(int elt, int idx) {
            this.elt=elt;
            this.idx=idx;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
            }
            List<Pair> list=new ArrayList<>();
            for(int i=0;i<n;i++) {
                list.add(new Pair(arr[i],i));
            }
            Collections.sort(list,(a,b)->Integer.compare(a.elt,b.elt));
            int res[]=new int[n];
            long pre[]=new long[n];
            pre[0]=list.get(0).elt;
            for(int i=1;i<n;i++) {
                pre[i]=pre[i-1]+list.get(i).elt;
            }
            res[list.get(n-1).idx] = n-1;
                for(int i=n-2;i>=0;i--) {
                    if(pre[i] >= list.get(i+1).elt) {
                        res[list.get(i).idx] = res[list.get(i+1).idx] ;
                    }
                    else {
                        res[list.get(i).idx] = i;
                    }
                }
                    

            // TLE
            // for(int i=0;i<n;i++) {
            //     long score = list.get(i).elt;
            //     int cnt=0;
            //     for(int j=0;j<n;j++) {
            //         if(i==j) continue;
            //         if(score >= list.get(j).elt) {
            //             score+=list.get(j).elt;
            //             cnt++;
            //         }
            //     }
            //     res[list.get(i).idx] = cnt;
            // }
            for(long e : res) System.out.print(e+" ");
            System.out.println();
        }
    }
}