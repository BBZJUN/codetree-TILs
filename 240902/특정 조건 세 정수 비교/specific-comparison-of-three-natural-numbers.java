import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int s = a;
        if(s>b){
            s=b;
        }
        if(s>c){
            s=c;
        }
        if (a==s) {
            System.out.print("1 ");
        }
        else {
            System.out.print("0 ");
        }


        if (a==b && b==c) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}