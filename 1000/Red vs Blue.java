import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0;t<T;t++) {
            int n=sc.nextInt();
            int r=sc.nextInt();
            int b=sc.nextInt();
            StringBuilder sb = new StringBuilder();
            int grp = r/(b+1);
            int rem = r%(b+1);
            for(int i=0;i<=b;i++) {
                int size = grp;
                if(rem>0) {
                    size++;
                    rem--;
                }
                for(int j=0;j<size;j++) sb.append("R");
                if(i < b) sb.append("B");
            }
            System.out.println(sb);
        }
    }
}