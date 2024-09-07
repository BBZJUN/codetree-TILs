import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int[] countArr = new int[11];
        int end = 0;

        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]==0){
                end=i;
                break;
            }
        }

        // 개수 세기
        for (int i = 0; i < end; i++) {
            countArr[arr[i]/10%10]++;
        }

        // 개수 출력
        for (int i = 1; i < 10; i++) {
            System.out.println(i+" - "+countArr[i]);
        }
    }
}