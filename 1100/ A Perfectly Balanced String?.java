import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            String s = sc.next();
            HashMap<Character,List<Integer>>map=new HashMap<>();
            int n=s.length();
            for(int i=0;i<n;i++) {
                char ch = s.charAt(i);
                    if(!map.containsKey(ch)) {
                        map.put(ch,new ArrayList<>());
                        map.get(ch).add(i);
                    }
                    else {
                        map.get(ch).add(i);
                    }
            }
            // System.out.println(map);
            boolean flag = true;
            int k = map.size();
            for(List<Integer> list : map.values()) {
                if(list.size()>1) {
                    int gap = list.get(1)-list.get(0);
                    if(gap != k) {
                        flag = false;
                        break;
                    }
                    for(int i=2; i<list.size();i++) {
                        if(list.get(i) - list.get(i-1) != k) {
                            flag = false;
                            break;
                        } 
                    }
                }
            }
            if(flag) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}