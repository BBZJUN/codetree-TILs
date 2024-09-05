import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];

        int n = sc.nextInt();
        int check=0;
        for (int i = 0; i < 100; i++) {

            arr[i] = sc.nextInt();
            if(arr[i]==0){
                check = i;
            }
        }

        System.out.println((arr[check - 1]+arr[check - 2]+arr[check - 3]));
    }
}