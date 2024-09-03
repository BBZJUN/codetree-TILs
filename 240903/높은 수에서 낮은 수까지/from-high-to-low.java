import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int big = a;
        int small = b;
        if (big < b){
            big = b;
            small = a;
        }

        for (int i = big; i >=small; i--) {
            System.out.print(i+" ");
        }
        
    }
}