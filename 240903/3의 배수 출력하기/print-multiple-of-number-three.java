import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=1;
        while(a<=n){
            if (a%3==0)
                System.out.print(a+ " ");
            a++;
        }
    }
}