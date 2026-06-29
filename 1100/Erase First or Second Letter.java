import java.util.*;
public class Main {
    static HashSet<String> set;
    public static void dfs(String s) {
        if(s.isEmpty() || set.contains(s)) return;
        set.add(s);
        // System.out.println(set);
        dfs(s.substring(1));
        if(s.length()>1) dfs(s.charAt(0)+s.substring(2));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            String s= sc.next();
            // set=new HashSet<>();
            // dfs(s);
            // System.out.println(set.size());
            HashSet<Character> set=new HashSet<>();
            long res = 0;
            for(int i=0;i<n;i++) {
                char ch = s.charAt(i);
                if(!set.contains(ch)) {
                    res += (n-i);
                    set.add(ch);
                }
            }
            System.out.println(res);
        }
    }
}