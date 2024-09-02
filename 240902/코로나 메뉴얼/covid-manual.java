import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char a1 = sc.next().charAt(0);
        int a2 = sc.nextInt();
        
        char b1 = sc.next().charAt(0);
        int b2 = sc.nextInt();
        
        char c1 = sc.next().charAt(0);
        int c2 = sc.nextInt();

        int check=0;

        if (a1 == 'Y' && a2 >= 37){
            check++;
        }
        if (b1 == 'Y' && b2 >= 37){
            check++;
        }
        if (c1 == 'Y' && c2 >= 37){
            check++;
        }

        if (check>=2){
            System.out.print("E");
        }
        else{
            System.out.print("N");
        }

        
    }
}