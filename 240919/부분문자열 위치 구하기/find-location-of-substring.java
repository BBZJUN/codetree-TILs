import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String in = sc.next();
        int check = -1;
        for (int i = 0; i < s.length()-(in.length()-1); i++) {
            if (s.substring(i,i+in.length()).equals(in)) {
                check = i;
                break;
            }
        }
        
        System.out.print(check);
        
    }
}