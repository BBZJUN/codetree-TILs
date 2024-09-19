import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char check1 = s.charAt(0);
        char check2 = s.charAt(1);
        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i)==check1){
                s[i] = check2;
            }
            else if (s.charAt(i)==check2){
                s[i] = check1;
            }
        }

        System.out.print(s);
    }
}