import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1 =sc.nextInt();
        int n2 =sc.nextInt();
        int[] A = new int[n1];
        int[] B = new int[n2];

        int check = 0;

        for (int i = 0; i<n1;i++){
            A[i] = sc.nextInt();
        }

        
        for (int i = 0; i<n2;i++){
            B[i] = sc.nextInt();
        }

        for (int i = 0; i<n2; i++){
            for (int j = 0 ; j<n1 ;j++){
                if(B[i]==A[j]){
                    check++;
                    if(check==n2){
                        break;
                    }
                }
                else{
                    check = 0;
                }
                if(check==n2){
                        break;
                    }
            }
        }
        if(check==n2){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }


        
    }
}