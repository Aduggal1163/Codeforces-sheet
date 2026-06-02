import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++) {
            int a = sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            //2b = a+c
            //case1
            if((a+c) % 2 == 0){
                int b2 = (a+c)/2;
                if(b2>0 && b2%b == 0) {
                    if(b2>0 && b2%b == 0) {
                        System.out.println("Yes");
                        continue;
                    }
                }
            }

            //case2
            int a2 = (2*b)-c;
            if(a2 > 0 && a2%a == 0) {
                System.out.println("Yes");
                continue;
            }
            //case3
            int c2 = (2*b)-a; 
            if(c2 > 0 && c2%c == 0) {
                System.out.println("Yes");
                continue;
            }
            System.out.println("No");
        }
    }
}