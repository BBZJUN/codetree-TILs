import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        while (true) {
            if (n % 2 == 0) {
                n = n / 2;
            }
            else {
                n = n*3 +1;
            }
            c++;
            if(n==1){
                break;
            }
        }
        System.out.println(c);
    }
}