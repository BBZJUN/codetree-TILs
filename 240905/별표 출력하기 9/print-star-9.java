import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 0 ; i--) {
            for (int j = 0; j < i && i!=n; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2*(n-i)-1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}