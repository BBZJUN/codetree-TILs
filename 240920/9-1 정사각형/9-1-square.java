import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int n = sc.nextInt();
        for (int i=0 ;i<n;i++){
            if (n==0){
                n=9;
            }
            for (int j=0;j<n;j++){
                System.out.print(n--);
            }
            System.out.println();
        }
    }
}