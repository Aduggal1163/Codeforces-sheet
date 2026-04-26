import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int m=sc.nextInt();
	    for(int t=0;t<m;t++) {
	       int n=sc.nextInt();
	       int x=sc.nextInt();
	       int[] fuels=new int[n+2];
	       fuels[0]=0;
	       fuels[n+1] = x;
	       for(int i=0;i<n;i++) {
	           fuels[i+1]=sc.nextInt();
	       }
	       int maxDiff=Integer.MIN_VALUE;
	       for(int i=1; i<n+2; i++) {
	           maxDiff = Math.max(maxDiff,fuels[i] - fuels[i-1]);
	           if(i==n+1) {
	               maxDiff = Math.max(maxDiff,(fuels[i] - fuels[i-1])*2); 
	           }
	       }
	       System.out.println(maxDiff);
	    }
	}
}