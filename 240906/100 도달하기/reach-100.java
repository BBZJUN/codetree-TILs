import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        arr[0] = 1;
        arr[1] = sc.nextInt();
        int c = 0;
        for (int i = 2; i<100; i++){
            arr[i] = arr[i-1]+arr[i-2];
            if(arr[i]>100){
                c=i;
                break;
            }
        }
        for (int i=0;i<=c;i++){
            System.out.print((arr[i])+" ");
           

        }

    }
}