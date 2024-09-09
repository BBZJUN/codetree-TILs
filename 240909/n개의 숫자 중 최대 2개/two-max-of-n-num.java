import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i=0; i<n ;i++){
            x[i] = sc.nextInt();
        }
        

        for (int i=0; i<n;i++){
            for (int j = i ; j<n;j++){
                if(x[i]<x[j]){
                    int tmp = x[i];
                    x[i] = x[j];
                    x[j] = tmp;
                }
            }
        }
        System.out.print(x[0]+" "+x[1]);
    }
}