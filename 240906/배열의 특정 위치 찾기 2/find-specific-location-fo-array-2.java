import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int big1=0;
        int big2=0;

        for (int i = 0 ; i<10; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0 ; i<10; i+=2){
            if (arr[i]>big1){
                big1=arr[i];
            }
        }

        for (int i = 1 ; i<10; i+=2){
            if (arr[i]>big2){
                big2=arr[i];
            }
        }
        int re = big1 - big2;
        if(re<0){
            re=re*(-1);
        }
        System.out.print(re);

    }
}