import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] x = new int[n][n]; 

        for (int i = 0; i<n;i++){
            x[0][i] = 1;
            x[i][0] = 1;
        }

        for (int i = 1; i<n;i++){
            for (int j = 1; j<n;j++){
                x[i][j] = x[i-1][j-1] + x[i-1][j] + x[i][j-1];
            }
        }

        // 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
            
        }
    }
}