import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] x = new int[n][m];
        int[][] y = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                x[i][j] = sc.nextInt();
            }
        }

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                y[i][j] = sc.nextInt();
            }
        }

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (x[i][j]==y[i][j])
                {
                    System.out.print(0+" ");
                }
                    
                
                else{
                    System.out.print(1+" ");
                }
                    
            }
            System.out.println();
        }
    }
}