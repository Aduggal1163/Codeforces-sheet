import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int q=0;q<t;q++) {
            char[][] arr = new char[10][10];
        for (int i = 0; i < 10; i++) {
        String row = sc.next();
        for (int j = 0; j < 10; j++) {
                arr[i][j] = row.charAt(j);
            }
        }
            int score=0;
            for(int i=0;i<10;i++) {
                for(int j=0;j<10;j++) {
                    if((i==0 || i==9 || j==0 || j==9) && arr[i][j] == 'X') score+=1;
                    else if((i==1 || i==8 || j==1 || j==8) && arr[i][j] == 'X') score+=2;
                    else if((i==2 || i==7 || j==2 || j==7) && arr[i][j] == 'X') score+=3;
                    else if((i==3 || i==6 || j==3 || j==6) && arr[i][j] == 'X') score+=4;
                    else if((i==4 || i== 5 || j == 4 || j==5) && arr[i][j] == 'X') score+=5;
                }
            }
            System.out.println(score);
        }
    }
}