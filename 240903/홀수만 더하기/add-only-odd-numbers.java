import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;

        for (int i = 1 ; i <= a; i++) {
           int k = sc.nextInt();
           if(k%2==1&&k%3==0)
                sum+=k;
            
        }
        System.out.println(sum);

    }
}