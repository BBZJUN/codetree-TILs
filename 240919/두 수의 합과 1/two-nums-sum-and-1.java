import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a+b;
        String re = Integer.toString(sum);

        int c = 0;
        for (int i=0; i<re.length(); i++){
            if (re.charAt(i)=='1'){
                c++;
            }
        }

        System.out.print(c);
        
    }
}