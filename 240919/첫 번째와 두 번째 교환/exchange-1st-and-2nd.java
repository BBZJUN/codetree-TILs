import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] arr = s.toCharArrat();
        char check1 = s.charAt(0);
        char check2 = s.charAt(1);
        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i)==check1){
                arr[i] = check2;
            }
            else if (s.charAt(i)==check2){
                arr[i] = check1;
            }
        }

        String a = String.valueOf(arr);

        System.out.print(a);
    }
}