import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int n = sc.nextInt();
        int tmp = 65;
        for (int i=0 ;i<n;i++){
            int a= sc.nextInt();
            int b = sc.nextInt();
            int sum = 0;
            for (int j=a; j<=b; j++){
                if (j%2==0){
                    sum+=j;
                }
            }
            System.out.println(sum);
        }
        
    }
}