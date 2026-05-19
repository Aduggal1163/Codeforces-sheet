import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int z=0;z<t;z++) {
            int n=sc.nextInt();
            String s=sc.next();
            int maxG=1;
            int curG=1;
            if(s.charAt(0)=='<') curG++;
            for(int i=1;i<s.length();i++) {
                if(s.charAt(i)=='<') {
                    curG++;
                }
                else curG=1;
                maxG=Math.max(maxG,curG);
            }
            maxG=Math.max(maxG,curG);
            int maxS=1;
            int curS=1;
            if(s.charAt(0)=='>') curS++;
            for(int i=1;i<s.length();i++) {
                if(s.charAt(i)=='>') {
                    curS++;
                }
                else curS=1;
                maxS=Math.max(maxS,curS);
            }
            maxS=Math.max(maxS,curS);
            System.out.println(Math.max(maxG,maxS));
        }
    }
}