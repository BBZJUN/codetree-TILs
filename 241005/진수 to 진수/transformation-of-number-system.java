import java.util.Scanner;

public class Main {
    public static final int MAX_DIGIT = 20;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String n = sc.next();

        int num = 0;
        for(int i = 0; i < (int) n.length(); i++)
            num = num * a + (n.charAt(i) - '0');
        
        
        // 이진수로 변환합니다.
        int[] digits = new int[MAX_DIGIT];
        int cnt = 0;
        
        while(true) {
            if(num < b) {
                digits[cnt++] = num;
                break;
            }
            
            digits[cnt++] = num % b;
            num /= b;
        }
        
        // 배열의 순서를 뒤집어 이진수를 출력합니다.
        for(int i = cnt - 1; i >= 0; i--)
            System.out.print(digits[i]);

    }
}