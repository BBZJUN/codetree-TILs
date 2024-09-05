import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] arr = new double[n];  // 크기가 n인 실수형을 저장하기 위한 배열 선언
        double sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }
        double avg = sum/n;
        System.out.printf("%.1f\n",avg);
        if (sum>=4.0){
            System.out.println("Perfect");
        }
        else if (sum>=3.0){
            System.out.println("Good");
        }
        else{
            System.out.println("Poor");
        }
        
    }
}