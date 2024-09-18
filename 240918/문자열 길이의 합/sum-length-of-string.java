import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int c = 0;
        int ca = 0;
        for (int i=0; i<n;i++){
            String x = sc.next();
            c=c+x.length();
            if (x.charAt(0)=='a'){
                ca++;
            }
        }
        System.out.println(c+" "+ca);
        
    }
}