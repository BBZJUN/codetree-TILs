import java.util.Scanner;
//Scanner sc = new Scanner(System.in);
//int n = sc.nextInt();

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 6; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
            }
            else {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}