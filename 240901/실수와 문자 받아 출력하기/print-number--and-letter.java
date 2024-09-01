import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%c\n%.2f\n%.2f",c,a,b);
    }
}