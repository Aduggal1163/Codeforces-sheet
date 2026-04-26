import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int z=0;z<t;z++) {
            int n = sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
            }
            List<Integer> list=new ArrayList<>();
            list.add(arr[0]);
            for(int i=1;i<n;i++) {
                if(arr[i]>=list.get(list.size()-1)) list.add(arr[i]);
                else {
                    list.add(arr[i]-1);
                    i--;
                }
            }
            System.out.println(list.size());
            for(int elt : list) System.out.print(elt+" ");
            System.out.println();
        }
    }
}