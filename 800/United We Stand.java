import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int z=0;z<t;z++) {
            int n = sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++) {
                a[i]=sc.nextInt();
            }
            List<Integer> b=new ArrayList<>();
            List<Integer> c = new ArrayList<>();
            Arrays.sort(a);
            int min = a[0];
            int i=0;
            while(i<n && a[i] == min) i++;
            if(i==n) {
                System.out.println(-1);
                continue;
            }
            int mn2 = a[i];
            for(int j=0;j<i;j++) b.add(a[j]);
            for(int j=i;j<n;j++) {
                if(a[j] % mn2 == 0) c.add(a[j]);
                else b.add(a[j]);
            }
            if(c.size() == 0) {
                System.out.println(-1);
                continue;
            }
            System.out.println(b.size()+" "+c.size());
            for(int x : b) System.out.print(x+" ");
            System.out.println();
            for(int x : c) System.out.print(x+" ");
        }
    }
}