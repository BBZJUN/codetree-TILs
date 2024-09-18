import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];
        char x;
        int tmp = 0;
        for (int i=0; i<10;i++){
            arr[i] = sc.next();
            
        }
        x = sc.next().charAt(0);


        for (int i=0; i<10;i++){
            if (arr[i].charAt(arr[i].length()-1)==x){
                System.out.println(arr[i]);
                tmp = 1;
            }
            
            
        }
        if (tmp==0){
            System.out.print("None");
        }
        
    }
}