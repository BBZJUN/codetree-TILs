import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tmp;
        tmp = a/b;
        if (tmp>=1){
            System.out.print(tmp+".");        
        }
        else{
            System.out.print("0.");
        }
        for (int i = 1; i <= 20; i++) {
            a = (a%b)*10;
            tmp = a/b;
            System.out.print(tmp);
        }
    }
}