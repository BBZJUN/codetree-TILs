import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int m = sc.nextInt();

        int num=1;

        for (int i = 0; i<m;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[x][y] = num++;
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