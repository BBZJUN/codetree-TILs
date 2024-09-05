import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];

        int val, sum;
        sum = 0;
        for (int i = 0; i < 10; i++) {
            val = sc.nextInt();
            sum += val;
            x[i]=val;
        }
        System.out.print(sum);
    }
}