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


        int r = 999;
        for (int i=n-1; i>=0 ;i--){
            for (int j=0; j<i; j++){
                if ((x[i]-x[j]) < r && (x[i]-x[j])>0){
                    r = x[i]-x[j];
                }
            }
        }
        System.out.print(r);
        

    }
}