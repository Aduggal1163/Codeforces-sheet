import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++) {
            int n=sc.nextInt();
            int cnt=0;
            boolean flag=true;
            while(n!=1) {
                if(n%2 != 0) {
                    n=n*2;
                    if(n%6 == 0) {
                        n/=6;
                        cnt++;
                    }
                    else {
                        flag=false;
                        break;
                    }
                    cnt++;
                }
                else {
                    if(n%6 == 0) {
                        n/=6;
                        cnt++;

                    }
                    else {
                        flag=false;
                        break;
                    }
                }
            }
            System.out.println(flag ? cnt : -1);
        }
    }
}