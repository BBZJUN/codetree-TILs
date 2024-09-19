import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int loc = s.indexOf('e');
        s=s.substring(0,loc)+s.substring(loc+1,s.length());

        System.out.println(s);
    }
}