import java.util.Scanner;

public class Main {

    public static int[] arr = new int[10];

    public static int f(int i){
        int k = 1;
        if (i==0){
            return arr[0];
        }
        else{
            for (; k<=arr[i]*arr[i-1]; k++){
                if(k%arr[i]==0 && k%arr[i-1]==0){
                    break;
                }
            }
        }
        arr[i-1]=k;
        return f(i-1);
    }


    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=0 ;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print(f(n-1));

    }
}