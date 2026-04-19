import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        for(int i=0;i<n;i++) {
        String str = sc.next();
        if(str.equals("++X") || str.equals("X++")) res++;
        else res--;
        }
        System.out.println(res);
    }
}