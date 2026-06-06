import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0; t<T; t++) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++) arr[i]=sc.nextInt();
			LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
			for(int elt : arr) map.put(elt,map.getOrDefault(elt,0)+1);
			// System.out.println(map);
			boolean valid = true;
			for(int elt : map.values()) {
				if(elt == 1) {
					valid = false;
					continue;
				}
			}
			map.clear();
			for(int i=0; i<n; i++) map.put(arr[i],i);
			if (valid) {
				int idx[]=new int[n];
				for(int i = 0; i<n; i++) {
					idx[i]=i+1;
				}
				List<Integer> list=new ArrayList<>();
				for(int elt : map.values()) {
					list.add(elt);
				}
				int j=0;
				for(int elt : list) {
					while(j<elt) {
						int temp = idx[j];
						idx[j]=idx[j+1];
						idx[j+1]=temp;
						j++;
					}
					j=elt+1;
				}
				for(int i=0; i<n; i++) System.out.print(idx[i]+" ");
				System.out.println();
			}
			else System.out.println(-1);
		}
	}
}


