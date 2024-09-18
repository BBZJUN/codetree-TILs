import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        String x="";

        for (int i=0; i<n; i++){
            arr[i] = sc.next();
            
        }

        
        for (int i=0; i<n; i++){
            x=x+arr[i];
            
        }
        System.out.print(x);

        // 여기에 코드를 작성해주세요.
    }
}