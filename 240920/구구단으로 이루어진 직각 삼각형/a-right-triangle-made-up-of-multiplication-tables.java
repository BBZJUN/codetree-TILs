import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int n = sc.nextInt();
        for (int i=1 ;i<=n;i++){ 
            for (int j=1; j<=(n-i+1);j++){
                System.out.printf("%d * %d = %d",i,j,(j*i));
                if (j!=(n-i+1)){
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}