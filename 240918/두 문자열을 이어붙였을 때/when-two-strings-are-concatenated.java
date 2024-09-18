import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String AB = A+B;
        String BA = B+A;
        int tmp = 0;
        for (int i=0; i<AB.length(); i++){
            if(AB.charAt(i)==BA.charAt(i)){

            }
            else{
                tmp = 1;
                break;
            }
            
        }

        
       if(tmp==0){
        System.out.print("true");
        
       }
       else{
        System.out.print("false");
        
       }

        // 여기에 코드를 작성해주세요.
    }
}