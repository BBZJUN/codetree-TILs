import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];
        for (int i=0; i<10;i++){
            x[i] = sc.nextInt();
        }
        
        int max = x[0];
        for (int i=0; i<10;i++){
            if (max < x[i]){
                max = x[i];
            }
        }
        System.out.print(max);
    }
}