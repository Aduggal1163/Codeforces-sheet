import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int z=0;z<t;z++) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            String x=sc.next();
            String s=sc.next();
            int ope=0;
            while(ope <= 10) {
                if(x.contains(s)) { 
                    System.out.println(ope);
                    break;
                }
                ope++;
                x = x+x;
            }
            if(!x.contains(s)) System.out.println(-1);
        }
    }
}