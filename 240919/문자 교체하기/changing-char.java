import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        int len = s2.length()-1;
        System.out.print(s1.substring(0,2)+s2.substring(2,len));
    }
}