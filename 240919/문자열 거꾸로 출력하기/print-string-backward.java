import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        for (int i=0; i<10; i++){
            String A = sc.next();
            if(A.compareTo("END")==0){
                break;
            }
            for (int j=A.length()-1; j>=0;j--){
                System.out.print(A.charAt(j));
            }
            
            System.out.println();
        }

        
    }
}