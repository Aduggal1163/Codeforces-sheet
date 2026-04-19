import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
        String s = "";
        int c1=0,c2=0,c3=0;
        for(char ch : str.toCharArray()) {
            if(ch=='1') c1++;
            else if(ch=='2') c2++;
            else if(ch=='3') c3++;
        }
        while(c1-->0) s+="1+";
        while(c2-->0) s+="2+";
        while(c3-->0) s+="3+";
        System.out.println(s.substring(0,s.length()-1));
    }
}