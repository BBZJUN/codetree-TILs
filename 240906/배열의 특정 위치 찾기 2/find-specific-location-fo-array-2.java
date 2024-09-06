import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum1=0;
        int sum2=0;

        for (int i = 0 ; i<10; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0 ; i<10; i+=2){
            
            sum1+=arr[i];
            
        }

        for (int i = 1 ; i<10; i+=2){
            sum2+=arr[i];
            
        }
        int re = sum1 - sum2;
        if(re<0){
            re=re*(-1);
        }
        System.out.print(re);

    }
}