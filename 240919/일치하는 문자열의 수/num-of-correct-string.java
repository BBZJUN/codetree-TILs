import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String A = sc.next();
        int c = 0;

        for (int i=0; i<n; i++){
            String B = sc.next();
            if(A.compareTo(B)==0){
                c++;
            }
        }
        System.out.print(c);

        
    }
}