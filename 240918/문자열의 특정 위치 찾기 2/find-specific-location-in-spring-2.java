import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[]{ "apple", "banana", "grape", "blueberry", "orange" };

        Scanner sc = new Scanner(System.in);

        char x = sc.next().charAt(0);
        int c=0;
        for (int i=0 ;i<5;i++){
            if (arr[i].charAt(2)==x || arr[i].charAt(3)==x ){
                System.out.println(arr[i]);
                c++;
            }
        }
        System.out.print(c);
       
    }
}