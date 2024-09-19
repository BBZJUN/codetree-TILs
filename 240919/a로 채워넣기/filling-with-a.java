import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int len = s.length();

        char[] arr = s.toCharArray();
        arr[1] = 'a';
        arr[len-2] = 'a';
        String s = String.valueOf(arr);
        
        
        System.out.print(s);
        
    }
}