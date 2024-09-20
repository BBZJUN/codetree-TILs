import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int n = sc.nextInt();
        int tmp = 65;
        for (int i=0 ;i<n;i++){ 
            for (int j=0; j<i;j++){
                System.out.print("  ");
            }
            for (int j=0; j<n-i;j++){
                System.out.print((char)(tmp++)+" ");
                if((char)tmp=='Z'){
                    tmp=65;
                }
            }
            System.out.println();
        }
    }
}