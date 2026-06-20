import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            String s = sc.next();
            Stack<Character> st=new Stack<>();
            int count = 0;
            for(int i=0;i<s.length();i++) {
                char ch = s.charAt(i);
                if(ch == '(') st.push(ch); 
                else if(!st.isEmpty() && ch == ')' && st.peek() == '(') {
                    st.pop();
                }
                else if(st.isEmpty() && ch == ')') count++;
            }
            System.out.println(count);
        }
    }
}




