import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int m=sc.nextInt();
	    for(int t=0;t<m;t++) {
	       int n=sc.nextInt();
	       String str = sc.next();
	       int conseqdot=1;
	       int maxconseqdot=1;
	       int totaldot=0;
	       for(int i=0;i<n;i++) {
	           char ch = str.charAt(i);
	           if(ch == '.') totaldot++;
	           if(i+1<n && ch =='.' && str.charAt(i+1) == '.') {
	               conseqdot++;
	           }
	           else {
	               conseqdot=1;
	           }
	           maxconseqdot = Math.max(maxconseqdot,conseqdot);
	       }
	       if(maxconseqdot>2) System.out.println(2);
	       else {
	           System.out.println(totaldot);
	       }
	    }
	}
}