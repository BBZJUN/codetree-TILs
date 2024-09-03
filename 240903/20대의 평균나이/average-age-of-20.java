import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        int c = 0;
        while (true) {
            int a = sc.nextInt();
            if(a>=20 && a<30){
                c++;
                s+=a;
            }
            else{
                break;
            }
            
        }
        System.out.printf("%.2f",s/c);
    }
}