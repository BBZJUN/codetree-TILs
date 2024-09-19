import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char pre;
        if (a=='a'){
            pre='z';
        }
        else{
            pre = (char)(a-1);
        }
        
        System.out.print(pre);
        
    }
}