import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char s = sc.next().charAt(0);
        int c = 0;
        for (int i = 0; i<str.lenght(); i++){
            if (str.charAt(i)==s){
                c++;
            }
        }
        System.out.print(c);
    }
}