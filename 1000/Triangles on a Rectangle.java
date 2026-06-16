import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0; t<T; t++) {
			long w=sc.nextLong();
			long h=sc.nextLong();

			int k1=sc.nextInt();
			int[] bottom = new int[k1];
			for(int i=0; i<k1; i++) {
				bottom[i]=sc.nextInt();
			}

			int k2=sc.nextInt();
			int[] top = new int[k2];
			for(int i=0; i<k2; i++) {
				top[i]=sc.nextInt();
			}

			int k3=sc.nextInt();
			int[] left = new int[k3];
			for(int i=0; i<k3; i++) {
				left[i]=sc.nextInt();
			}

			int k4=sc.nextInt();
			int[] right = new int[k4];
			for(int i=0; i<k4; i++) {
				right[i]=sc.nextInt();
			}

			long ans1=0;
			long ans2=0;
			long ans3=0;
			long ans4=0;
			long ansFinal=0;
			ans1= (long) Math.max(ans1,(bottom[k1-1] - bottom[0]) * h);
			ans2= (long) Math.max(ans2,(top[k2-1] - top[0]) * h);
			ans3= (long) Math.max(ans3,(left[k3-1] - left[0]) * w);
			ans4= (long) Math.max(ans4,(right[k4-1] - right[0]) * w);
			ansFinal= (long) Math.max(Math.max(ans1,ans2),Math.max(ans3,ans4));
			System.out.println(ansFinal);

		}
	}
}