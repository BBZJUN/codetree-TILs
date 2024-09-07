import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        char[] word = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        int c = 0;
        for (int i = 0; i < 6; i++) {
            if (word[i] == x) {
                System.out.println(i);
                c=1;
                break;
            }
        }
        if (c==0){
            System.out.print("None");
        }


    }
}