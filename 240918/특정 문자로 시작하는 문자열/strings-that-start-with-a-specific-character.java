import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String[] arr = new String[n];
        char x;
        int c = 0 ;
        int sum = 0;
        for (int i=0; i<n;i++){
            arr[i] = sc.next();
            
        }
        x = sc.next().charAt(0);


        for (int i=0; i<n;i++){
            if (arr[i].charAt(0)==x){
                c++;
                sum=sum+arr[i].length();
            }
            
            
        }
        System.out.printf("%d %.2f",c,(double)sum/c);
        
    }
}