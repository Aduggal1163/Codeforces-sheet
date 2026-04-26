import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int z=0;z<t;z++) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n-1;i++) {
                arr[i]=sc.nextInt();
            }
            int conceded = 0;
            int scored = 0;
            for(int elt : arr) {
                if(elt < 0) conceded+=elt;
                else scored+=elt;
            }
            int absconceded = Math.abs(conceded);
            if(absconceded > scored) {
                System.out.println(absconceded - scored);
            }
            else {
                System.out.println(absconceded - scored);
            }
        }
    }
}