import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기작성해주세요.
        int[][] x = new int[4][4];
        Scanner sc = new Scanner(System.in);
        int sum=0;

        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                x[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                if (j<=i){
                    sum+=x[i][j];
                }
            }
        }

        
        System.out.printf("%d", sum);


    }
}