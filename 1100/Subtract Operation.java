import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int l = 0;
            int r = 1;
            boolean flag = false;

            while (r < n) {
                int diff = arr[r] - arr[l];

                if (diff == k) {
                    flag = true;
                    break;
                } else if (diff < k) {
                    r++;
                } else {
                    l++;
                    if (l == r) {
                        r++;
                    }
                }
            }

            System.out.println(flag ? "YES" : "NO");
        }

        sc.close();
    }
}