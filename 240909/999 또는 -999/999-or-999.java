import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] x = new int[100];
        int index = 0;
        for (int i=0; ;i++){
            x[i] = sc.nextInt();
            if (x[i]==999 || x[i]==-999){
                index=i;
                break;
            }
        }
        
        int min = x[0];
        for (int i=0; i<index;i++){
            if (min > x[i]){
                min = x[i];
            }
        }

        int max = x[0];
        for (int i=0; i<index;i++){
            if (max < x[i]){
                max = x[i];
            }
        }
        System.out.print(max+" "+min);
    }
}