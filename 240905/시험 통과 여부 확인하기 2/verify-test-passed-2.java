import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];  // 크기가 n인 실수형을 저장하기 위한 배열 선언

        int sum=0;
        int g=0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            arr[i] = a+b+c+d;
        }

        for (int i = 0; i < n; i++) {

            if (arr[i]/4>=0){
                g++;
                System.out.println("pass");
            }
            else{
                System.out.println("fail");
            }
            
            
        }

        System.out.printf("%d", g);
        
        
    }
}