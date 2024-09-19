import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char next='';
        if (a=='z'){
            next='a';
        }
        else{
            char next = (char)(a+1);
        }
        
        System.out.print(next);
        
    }
}