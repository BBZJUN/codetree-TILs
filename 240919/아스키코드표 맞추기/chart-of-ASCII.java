import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[5];
        for (int i=0; i<5;i++){
            arr[i]=sc.next().charAt(0);
        }
        for (int i=0; i<5;i++){
            System.out.print((char)arr[i]+" ");
        }
    }
}