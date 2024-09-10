import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];
        int[] y = new int[10];
        int xi=0;
        int yi =0;
        for (int i=0; i<10 ;i++){
            int n = sc.nextInt();
            if (n>500){
                y[yi]=n;
                yi++;
            }
            else{
                x[xi]=n;
                xi++;
            }
        }
        int min = y[0];
        for (int i=0; i<yi;i++){
            if (min>y[i]){
                min = y[i];
            }
        }

        int max = x[0];
        for (int i=0; i<xi;i++){
            if (max<x[i]){
                max = x[i];
            }
        }
        System.out.print(max+" "+min);

    }
}