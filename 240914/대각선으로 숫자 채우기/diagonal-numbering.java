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
        int check = 0;
        int t = 0;
        for (int i = 0; i < m; i++) {
            k=0;
            w = i;
            x[k][w] = g++;
            t++;
            for (; ;){
                k++;
                w--;
                if(w<0 || k>=n){
                    break;
                }
                x[k][w] = g++;
            }
            check=1;

        }

        if (check==1){

            g=g-t;
        }
        for (int i=0;i<n;i++){
            k=i;
            w = m-1;
            x[k][w] = g++;
            for (; ;){
                k++;
                w--;
                if(k>=n || w<0){
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