import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int n = sc.nextInt();
        int g = 9;
        for (int i=0 ;i<n;i++){
            if (g==0){
                g=9;
            }
            for (int j=0;j<n;j++){
                System.out.print(g--);
            }
            System.out.println();
        }
    }
}