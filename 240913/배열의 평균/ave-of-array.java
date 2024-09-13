import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기작성해주세요.
        int[][] x = new int[2][4];
        Scanner sc = new Scanner(System.in);
        double[] ii = new double[2];
        double[] jj = new double[4];
        int tsum = 0;
        int s = 0;

        for (int i=0; i<2; i++){
            for (int j=0; j<4; j++){
                x[i][j] = sc.nextInt();
            }
        }

        
        for (int i=0; i<2; i++){
            for (int j=0; j<4; j++){
                tsum+=x[i][j];
                ii[i]+=x[i][j];
            }
            ii[i] /= 4;
        }
        for (int i=0; i<4; i++){
            for (int j=0; j<2; j++){
                jj[i]+=x[j][i];
            }
            jj[i] /=2;
        }
        for (int i=0; i<2; i++){
            System.out.printf("%.1f ", (double)ii[i]);
        }
        System.out.println();
        
        for (int i=0; i<4; i++){
            System.out.printf("%.1f ", (double)jj[i]);
        }
        System.out.println();

        System.out.printf("%.1f", (double)tsum/8);


    }
}