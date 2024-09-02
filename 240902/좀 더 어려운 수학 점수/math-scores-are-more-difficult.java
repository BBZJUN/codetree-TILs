import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        if (a1 > b1) {
            System.out.println("A");
        }
        else if(b1 > a1){
            System.out.println("B");
        }
        else{
            if (a2 > b2) {
                System.out.println("A");
            }
            else if(b2 > a2){
                System.out.println("B");
            }
        }
    
        

    }
}