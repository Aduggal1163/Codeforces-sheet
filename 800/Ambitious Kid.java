import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int minElt=Integer.MAX_VALUE;
        for(int elt : arr) {
            if(elt == 0 ) {
                minElt = 0;
                break;
            }
            minElt=Math.min(minElt,Math.abs(elt));
        }
        System.out.println(Math.abs(minElt));
    }
}