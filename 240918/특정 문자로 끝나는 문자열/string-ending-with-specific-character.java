import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];
        char x;
        for (int i=0; i<10;i++){
            arr[i] = sc.next();
            
        }
        x = sc.next().charAt(0);


        for (int i=0; i<10;i++){
            if (arr[arr[i].length-1]==x){
                System.out.println(arr[i]);
            }
            
            
        }
        
    }
}