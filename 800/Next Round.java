import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++) {
        arr[i]=sc.nextInt();
      }
      int cnt=0;
      for(int elt : arr) {
        if(elt>=arr[k-1] && elt>0) cnt++;
      }
      System.out.println(cnt);
    }
}