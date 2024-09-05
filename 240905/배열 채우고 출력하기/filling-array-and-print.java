import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] x = new char[10];
        for (int i = 0; i < 10; i++) {
            char val = sc.next().charAt(0);
            x[i]=val;
        }
        for (int i = 9 ; i>=0; i--){
            System.out.print(x[i]+" ");
        }
    }
}