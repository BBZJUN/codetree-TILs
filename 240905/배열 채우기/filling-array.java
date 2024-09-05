import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];  // 크기가 n인 실수형을 저장하기 위한 배열 선언
        int i;
        for (i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (arr[i]==0){
                break;
            }
        }
        for (int k=i-1;k>=0;k--){
            System.out.print(arr[k]+" ");
        }
        
    }
}