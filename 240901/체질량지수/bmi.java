import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double bmi = b / ((a/100) * (a/100));
        System.out.printf("%d\n",(int)bmi);
        if (bmi >= 25) {
            System.out.println("Obesity");
        }
        
    }
}