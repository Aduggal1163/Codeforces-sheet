import java.util.*;
class Main {
    public static boolean dissort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++) {
            if(i+1<n && arr[i] > arr[i+1]) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        for(int z=0;z<t;z++) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
            }
            boolean sorted = dissort(arr);
            if(sorted == true) {
                System.out.println(0);
                continue;
            }
            int minDiff = Integer.MAX_VALUE;
            for(int i=1;i<n;i++) {
                minDiff=Math.min(minDiff,(arr[i]-arr[i-1]));
            }
            System.out.println((minDiff/2)+1);
        }
    }
}