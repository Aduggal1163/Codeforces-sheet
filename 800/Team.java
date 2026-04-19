import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n = sc.nextInt();
        int ans=0;
      for(int i=0;i<n;i++) {
        int P=sc.nextInt();
        int V=sc.nextInt();
        int T=sc.nextInt();
        int cnt = 0;
        if(P == 1) cnt++;
        if(V == 1) cnt++;
        if(T == 1) cnt++;
        if(cnt>=2) ans++;
      }
        System.out.println(ans);
    }
}