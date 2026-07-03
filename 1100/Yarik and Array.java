import java.util.*;
public class Main {
    static String prev = "";
    public static boolean isValid(int no) {
        no = Math.abs(no);
        if(no % 2 == 0) {
            if(prev.equals("O")) {
                prev = "E";
                return true;
            }
        }
        else{
                if(prev.equals("E")) {
                    prev = "O";
                    return true;
                }
            }
            prev = (no % 2 == 0) ? "E" : "O";
            return false;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
            prev = "";
			int n=sc.nextInt();
			int nums[]=new int[n];
			for(int i=0; i<n; i++) {
				nums[i]=sc.nextInt();
			}
            isValid(nums[0]);
            int maxsum = nums[0];
            int cursum = nums[0];
            for(int i=1;i<n;i++) {
                if(isValid(nums[i])) {
                    cursum = Math.max(nums[i] , cursum + nums[i]);
                }                
                else {
                    cursum = nums[i];
                }
                maxsum = Math.max(maxsum,cursum);
            }
			System.out.println(maxsum);
		}
	}
}