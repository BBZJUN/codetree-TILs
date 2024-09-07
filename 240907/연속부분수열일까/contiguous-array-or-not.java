import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1 =sc.nextInt();
        int n2 =sc.nextInt();
        int[] A = new int[n1];
        int[] B = new int[n2];

        int check = 1;
        int end = 0;
        for (int i = 0; i<n1;i++){
            A[i] = sc.nextInt();
        }

        
        for (int i = 0; i<n2;i++){
            B[i] = sc.nextInt();
        }

        for (int i = 0 ;i<n1;i++){
            if (B[0]==A[i]){
                for (int j = 0 ; j<n2;j++){
                    if (B[j]==A[i+j] && (i+j)<n1){
                        if (j==n2-1){
                            System.out.print("Yes");
                            end = 1;
                        }
                    }
                    else{
                        break;
                    }
                }
            }
        }

        if(end==0){
            System.out.print("No");
        }



        
    }
}