import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] x = new int[n][n];
        int check = 1;
        int num= 1;
        for (int i = n-1; i>=0; i--){

            if (check==0)
            {
                for (int j = 0 ; j<n;j++){
                    x[j][i]=num++;
                }
                check = 1;
            }

            else
            {
                for (int j=n-1; j>=0; j--){
                    x[j][i]=num++;
                }
                check = 0;
            }
        }

        for (int i = 0 ; i<n;i++){
            for (int j = 0 ; j<n;j++){
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
    }
}