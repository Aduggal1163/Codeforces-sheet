import java.util.*;
class Watermelon {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          if(n%2 != 0 || n<3) System.out.println("NO");
          else {
              for(int i=2;i<=n/2;i++) {
                  if(i%2==0 && (n-i) % 2 == 0) {
                      System.out.println("YES");
                      break;
                  }
              }
          }
    }
}