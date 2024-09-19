import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[200];
        int check = 0;
        for (int i=0; i<200; i++){
            arr[i] = sc.next();
            if(arr[i].compareTo("0")==0){
                System.out.println(i);
                check = i;
                break;
            }
            
            
        }
        for (int i=0; i<check;i+=2){
            System.out.println(arr[i]);
        }

        
    }
}