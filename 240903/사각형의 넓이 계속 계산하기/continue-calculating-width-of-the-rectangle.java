import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            char x = sc.next().charAt(0);
            System.out.println(a*b);
            if (x=='C'){
                break;
            }
            
        }
    }
}