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
        
        System.out.print(s);
        


       
    }
}