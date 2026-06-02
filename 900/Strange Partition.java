import java.util.*;public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++) {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
            }
            long sum=0;
            for(int elt : arr) sum+=elt;
            long min=(long) Math.ceil((double)sum/x);
            sum=0;
            for(int elt : arr) {
                sum+=(long) Math.ceil((double)elt/x);
            }
            long max=sum;
            System.out.println(min+" "+max);
        }
    }
}



