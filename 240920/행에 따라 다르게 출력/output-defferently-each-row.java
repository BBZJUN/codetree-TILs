import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int n = sc.nextInt();
        int number = 0;
        for (int i=0 ;i<n;i++){ 
            if (i%2==0){
                for (int j=0;j<n;j++){
                    System.out.print(++number+" ");
                }

            }
            else{           
                for (int j=0;j<n;j++)
                {   
                    number+=2;
                    System.out.print(number+" ");
                }
            }
            System.out.println();
        }
    }
}