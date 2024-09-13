import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] x = new int[n][m];

        int g = 0;

        for (int i = 0; i < m; i++) {
            if (i%2==0){
                for (int j = 0; j < n; j++){
                    x[j][i]=g;
                    g++;
                }
            }
            else{
                for (int j = n-1; j >= 0; j--){
                    x[j][i] = g;
                    g++;
                
            }
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