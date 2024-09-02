import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int m = b;
        if (a>m && c > m){
            if (a>c){
                m=c;
            }
            else{
                m=a;
            }
        }
        if(m>a && m>c){
            if(a>c){
                m = a;
            }
            else{
                m= c;
            }
        }
        System.out.print(m);
        

        
    }
}