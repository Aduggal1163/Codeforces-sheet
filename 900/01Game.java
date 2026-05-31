import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            String s = sc.next();

            int zero = 0;
            int one = 0;

            for (char ch : s.toCharArray()) {

                if (ch == '0') zero++;
                else one++;
            }

            int moves = Math.min(zero, one);

            if (moves % 2 == 1) {
                System.out.println("DA");
            }
            else {
                System.out.println("NET");
            }
        }
    }
}