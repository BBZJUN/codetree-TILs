import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100];
        int c=0;
        for (int i = 0; i<100; i++){
            arr[i]=n*(i+1);
            if(arr[i]%5==0){
                c++;
            }
            if(c==2){
                c=i;
                break;
            }
        }


        for (int i = 0; i<c; i++){
            System.out.print(arr[i]+" ");
        }
    }
}