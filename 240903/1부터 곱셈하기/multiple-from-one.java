import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 1;
        
        for (int i = 1; i <= 10; i++) {
            p *=i;
            if (p>=n) {
                System.out.println(i);
                break;
            }
            
        }


    }
}