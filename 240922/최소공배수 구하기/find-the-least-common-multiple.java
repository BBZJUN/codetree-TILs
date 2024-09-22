import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m = sc.nextInt();
        f(n,m);
    }


    public static void f(int n, int m){
        int re = n*m;
        for (int i=1; i<=Math.min(n,m); i++){
            if (n%i==0 && m%i==0){
                re = i*(n/i)*(m/i);
            }
        }
        System.out.print(re);
    }
}