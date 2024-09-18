import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = 0;
        for (int i=0; i<10;i++){
            String x = sc.next();
            c=c+x.length();
        }
        System.out.println(c);
        
    }
}