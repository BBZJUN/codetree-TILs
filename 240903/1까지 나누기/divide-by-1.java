import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 1; i <= 100; i++) {
            n = n/i;
            if (n<=1) {
                System.out.println(i);
                break;
            }
            
        }


    }
}