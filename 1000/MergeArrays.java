import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++) {
            int n=sc.nextInt();
            int arr1[]=new int[n];
            int arr2[]=new int[n];
            for(int i=0;i<n;i++) arr1[i]=sc.nextInt();
            for(int i=0;i<n;i++) arr2[i]=sc.nextInt();
            int cnt=1;
            HashMap<Integer,Integer> map1=new HashMap<>();
            HashMap<Integer,Integer> map2=new HashMap<>();
            for(int i=1;i<n;i++) {
                int elt = arr1[i];
                int prev=arr1[i-1];
                if(elt == prev){
                    cnt++;
                }
                else {
                    map1.put(prev,Math.max(map1.getOrDefault(prev,0),cnt));
                    cnt = 1;
                }
            }
            map1.put(arr1[n-1],Math.max(map1.getOrDefault(arr1[n-1],0),cnt));
            cnt = 1;
            for(int i=1;i<n;i++) {
                int elt = arr2[i];
                int prev=arr2[i-1];
                if(elt == prev){
                    cnt++;
                }
                else {
                    map2.put(prev,Math.max(map2.getOrDefault(prev,0),cnt));
                    cnt = 1;
                }
            }
            map2.put(arr2[n-1],Math.max(map2.getOrDefault(arr2[n-1],0),cnt));
            int ans=1;
            for(int elt : map1.keySet()) {
                ans=Math.max(ans,map1.get(elt)+map2.getOrDefault(elt,0));
            }
            for(int elt : map2.keySet()) {
                ans=Math.max(ans,map2.get(elt)+map1.getOrDefault(elt,0));
            }
            System.out.println(ans);
        }
    }
}