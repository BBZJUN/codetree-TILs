import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];  // 크기가 n인 실수형을 저장하기 위한 배열 선언

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        for (int i = n-1; i >=0; i--) {

            if (arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }           
            
        }

        
        
    }
}