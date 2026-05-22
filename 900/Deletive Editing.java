import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0) {
            String s= sc.next();
            String t=sc.next();
            HashMap<Character,Integer> map=new HashMap<>();
            for(char ch : t.toCharArray()) {
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            StringBuilder sb=new StringBuilder();
            for(int i=s.length()-1;i>=0;i--) {
                if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))>0) {
                    sb.append(s.charAt(i));
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
                }
            }
            sb.reverse();
            if(sb.toString().equals(t)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}