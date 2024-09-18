import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();
        if(n>str.length()){
            for(int i = 0; i < str.length(); i++){
                System.out.print(str.charAt(str.length()-i-1));
            }
        }
        else{
            for(int i = 0; i < n; i++){
                System.out.print(str.charAt(str.length()-i-1));
            }
        }
    }
}