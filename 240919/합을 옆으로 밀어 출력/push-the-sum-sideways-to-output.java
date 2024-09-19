import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i=0; i<n; i++){
            sum+=sc.nextInt();
        }

        String re = Integer.toString(sum);
        System.out.print(re.substring(1,re.length())+re.substring(0,1));

        
    }
}