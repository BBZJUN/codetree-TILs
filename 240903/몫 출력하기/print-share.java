import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int c = 0;
        while (true) {
            n = sc.nextInt();
            if (n%2 == 1) {
                System.out.println((int)n/2);
                c++;
                if(c>2){
                    break;
                }
            }
            
        }
    }
}