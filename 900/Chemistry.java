import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int z=0;z<t;z++) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
                // System.out.println(z+1);
            if((n-k)<=1) {
                System.out.println("YES");
                continue;
            }
            else {
                HashMap<Character,Integer> map=new HashMap<>();
                for(char elt : s.toCharArray()) {
                    map.put(elt,map.getOrDefault(elt,0)+1);
                }
                // List<Integer> list = new ArrayList<>();
                int odd=0;
                for(int elt : map.values()) {
                    if(elt % 2 != 0) {
                        // list.add(elt);
                        odd++;
                    }
                }
                // Collections.sort(list);
                // for(int i=0;i<list.size();i++) {
                //     if(list.get(i) <= k) {
                //         k-=list.get(i);
                //         list.set(i,0);
                //     }
                // }
                // if(z+1 == 6)System.out.println(list);
                // for(int elt : list) {
                //     if(elt>0) odd++;
                // }
                if(odd - 1 <= k) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
        }
    }
}