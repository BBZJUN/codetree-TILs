import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];  // 크기가 n인 실수형을 저장하기 위한 배열 선언

        int sum=0;
        int c=0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {

            if (arr[i]==0){
                break;
            }
            sum+=arr[i];
            c++; 
            
        }

        System.out.printf("%d %.1f", sum,(double)sum/c);
        
        
    }
}