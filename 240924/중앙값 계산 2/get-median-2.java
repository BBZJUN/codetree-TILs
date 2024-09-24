import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Integer[] arr = new Integer[n];

        for (int i=0 ;i<n; i++){
            arr[i] = sc.nextInt();
            if ((i+1)%2==1){
                Arrays.sort(arr,0,i+1);
                System.out.print(arr[i/2]+" ");
            }
        }
    }
}