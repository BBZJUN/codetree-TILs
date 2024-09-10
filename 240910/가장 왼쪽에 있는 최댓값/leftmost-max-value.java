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

        int j = 0;
        for (; ;){
            if (0==n){
                break;
            }
            int max = x[0];
            int maxindex = 0;
            for (j = 0; j<n;j++){
                if (max < x[j]){
                    max = x[j];
                    maxindex = j;
                }
            }
            System.out.print(maxindex+1+" ");
            n=maxindex;
        }

    }
}