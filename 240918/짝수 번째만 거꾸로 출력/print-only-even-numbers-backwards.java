import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for (int i=str.length()-1; i>=0; i--){
            if((i+1)%2==0){
                System.out.print(str.charAt(i));
            }
            
        }

        // 여기에 코드를 작성해주세요.
    }
}