import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String check1 = "No";
        String check2 = "No";

        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 2).equals("ee")) {
                check1 = "Yes";
            }
            if (s.substring(i, i + 2).equals("ab")) {
                check2 = "Yes";
            }
        }
        System.out.printf("%s %s",check1,check2);
    }
}