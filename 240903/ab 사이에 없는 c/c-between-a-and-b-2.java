import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean satisfied = true;
        for (int i = a; i <= b; i++) {
            if (c % i == 0) {
                satisfied = false;
                break;
            }
        }
        if (satisfied == false) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}