import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int n2=0;
        int n3=0;
        int n12=0;

        for (int i = 1 ; i <= n; i++) {
            if (i%12==0){
                n12++;
            }
            else if(i%3==0){
                n3++;
            }
            else if(i%2==0){
                n2++;
            }
            
        }
        System.out.println(n2 +" "+ n3+" "+n12);

    }
}