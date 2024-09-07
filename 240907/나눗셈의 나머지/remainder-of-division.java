import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int[] r = new int[100];
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = 0;
        int x = 1;
        int sum = 0;

        for( ; ;i++){
            if (a<=1){
                break;
            }
            arr[i]=a/b;
            r[i]=a%b;
            a=arr[i];
        }
        for (int k=0;k<i;k++){            
            x = 1;
            for (int j=0;j<r[k];j++){
                x=x*2;
            }
            System.out.println(x);
            sum=sum+x;         
            
        }
        System.out.print(sum);
        
}
}