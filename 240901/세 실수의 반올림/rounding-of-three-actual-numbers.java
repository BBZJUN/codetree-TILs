import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.printf("%.3f",a+0.0005);
        System.out.printf("%.3f",b+0.0005);
        System.out.printf("%.3f",c+0.0005);
    }
}