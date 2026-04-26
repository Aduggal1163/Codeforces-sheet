import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int s=0;s<t;s++) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
            }
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int elt : arr) map.put(elt,map.getOrDefault(elt,0)+1);
            if(map.size() == 1) System.out.println("Yes");
            else if(map.size()>2) System.out.println("No");
            else {
                int prevval=Integer.MAX_VALUE;
                int mindiff=Integer.MAX_VALUE;
                for(int elt : map.values()) {
                    mindiff = Math.abs(prevval-elt);
                    prevval=elt;
                }
                if(mindiff <= 1) System.out.println("Yes");
                else System.out.println("No");
            }
        }
    }
}