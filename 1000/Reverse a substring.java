import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int idx = n-1;
        char small = s.charAt(n-1);
        for(int i=n-2;i>=0;i--) {
            char ch = s.charAt(i);
            if(ch>small) {
                System.out.println("Yes\n"+(i+1)+" "+(idx+1));
                return;
            }
            if(ch<small) {
                small = ch;
                idx = i;
            }
        }
        System.out.println("No");
	}
}




