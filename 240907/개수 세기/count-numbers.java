import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] x = new int[a];
        int c= 0;

        for (int i = 0; i < a; i++) {
            x[i]=sc.nextInt();
        }
        for (int i = 0; i < a; i++) {
            if (b==x[i]){
                c++;
            }
        }
    System.out.print(c);

    }
}