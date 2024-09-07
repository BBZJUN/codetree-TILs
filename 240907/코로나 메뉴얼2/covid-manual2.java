import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        char[] crr = new char[3];
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
   

        for (int i = 0; i < 3; i++) {
            crr[i] = sc.next().charAt(0);
            arr[i] = sc.nextInt();
        }

        // 개수 세기
        for (int i = 0; i < 3; i++) {
            if (crr[i]=='Y'&&arr[i]>=37){
                a++;
            }
            else if(crr[i]=='N'&&arr[i]>=37){
                b++;
            }
            else if(crr[i]=='Y'&&arr[i]<37){
                c++;
            }
            else{
                d++;
            }
        }
        if (a>=2)
            System.out.printf("%d %d %d %d E",a,b,c,d);
        else
            System.out.printf("%d %d %d %d",a,b,c,d);
    }
}