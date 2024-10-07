import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        int count = 1;
        int pre = 0;
        int max = 0;
        for (int i=0; i<n; i++){
            int k = sc.nextInt();
            if (i>0 && k>t && k>pre ){
                count++;
                
            }
            else{
                count=0;
            }

            max = Math.max(count,max);


            pre = k;
        }
        if (max==1){
            System.out.print(0);
        }
        else{
            System.out.print(max);
        }
        
    }
}