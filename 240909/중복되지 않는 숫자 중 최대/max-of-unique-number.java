import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i=0; i<n ;i++){
            x[i] = sc.nextInt();
        }

        int ch = 0;
        for (int i=0; i<n -1;i++){
            ch = 0;
            for (int j = i+1 ; j<n;j++){
                if(x[i]==x[j]){
                    ch = 1;
                    x[j] = -1;
                }
            }
            if ( ch==1){
                x[i] = -1;
            }
        }

        int max = x[0];

        for (int i=0; i<n; i++){
            if (max < x[i]){
                max = x[i];
            }
        }
        System.out.print(max);

    }
}