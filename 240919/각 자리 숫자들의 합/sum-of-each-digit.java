import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String re = Integer.toString(n);

        int c = 0;
        for (int i=0; i<re.length(); i++){
            c+=Integer.parseInt(re.charAt(i));
        }

        System.out.print(c);
        
    }
}