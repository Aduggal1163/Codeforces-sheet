import java.util.*;
class Main {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
            for(int i=0;i<n;i++) {
                String str = sc.next();
                if(str.length()<=10) System.out.println(str);
                else {
                    int len =(str.substring(1,str.length()-1)).length();
                    String name = str.charAt(0)+Integer.toString(len)+str.charAt(str.length()-1);
                    System.out.println(name);
                    
                }
            }
        }
    }