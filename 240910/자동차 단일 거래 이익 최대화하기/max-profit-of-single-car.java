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


        int r = -1;
        for (int i=0; i<n-1 ;i++){
            for (int j=i+1; j<n; j++){
                if ((x[i]-x[j]) > r){
                    r = x[i]-x[j];
                }
            }
        }
        System.out.print(r);
        

    }
}