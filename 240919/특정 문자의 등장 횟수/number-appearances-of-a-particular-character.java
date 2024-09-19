import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int c1 = 0;
        int c2 = 0;

        for (int i = 0; i < s.length()-1; i++) {
            if (s.substring(i,i+2).equals("ee")) {
                c1++;
            }
            if (s.substring(i,i+2).equals("eb")) {
                c2++;
            }
        }
        
        System.out.print(c1+" "+c2);
        
    }
}