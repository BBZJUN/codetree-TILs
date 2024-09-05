import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];
        int sum = 0;
        int c = 0;
        for (int i = 0; i < 10; i++) {
            int val = sc.nextInt();
            if (val >= 250){
                x[i]=val;
                sum+=val;
                c++;
            }
            
        }
        System.out.printf("%d %.1f",sum,(double)sum/c);
        
    }
}