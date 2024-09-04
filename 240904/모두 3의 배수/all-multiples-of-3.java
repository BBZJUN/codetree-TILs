import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int c = 1;
        for (int i = 1; i <= 5; i++) {
            int n = sc.nextInt();
            if (n % 3 == 0) {
            }
            else{
                c=0;
            }
        }
        if (c == 1) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}