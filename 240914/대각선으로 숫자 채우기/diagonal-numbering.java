import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] x = new int[n][m];

        int g = 1;
        int k = 0;
        int w = 0;
        for (int i = 0; i < m; i++) {
            k=0;
            w = i;
            x[k][w] = g++;
            for (; ;){
                k++;
                w--;
                if(w<0 || k>=n){
                    break;
                }
                x[k][w] = g++;
            }

        }
        for (int i=1;i<n;i++){
            k=i;
            w = m-1;
            x[k][w] = g++;
            for (; ;){
                k++;
                w--;
                if(k>=n){
                    break;
                }
                x[k][w] = g++;
            }

        }
    
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < m; j++){
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
            
        }
    }
}