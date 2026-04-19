import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str=sc.next();
      HashSet<Character> set=new HashSet<>();
      for(char ch : str.toCharArray()) {
            set.add(ch);
      }
      if(set.size() % 2 != 0) System.out.println("IGNORE HIM!");
      else System.out.println("CHAT WITH HER!"); 
    }
}