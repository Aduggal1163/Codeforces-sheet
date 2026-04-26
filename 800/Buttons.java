import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int z=0;z<t;z++) {
            int a = sc.nextInt();
            int k = sc.nextInt();
            int e = sc.nextInt();
            String name = "";
            if(a > k) name = "Anna";
            else if (a<k) name = "Katie";
            else {
                if(e % 2 != 0) name = "Anna";
                else name = "Katie";
            }
            if(name.equals("Anna")) System.out.println("First");
            else System.out.println("Second");
        }
    }
}