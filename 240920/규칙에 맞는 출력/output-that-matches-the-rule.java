import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int n = sc.nextInt();
        int tmp = n;
        for (int i=0 ;i<n;i++){ 
            tmp = n-i;
            for (int j=0; j<=i;j++){
                System.out.print((tmp++)+" ");
                
            }
            System.out.println();
        }
    }
}