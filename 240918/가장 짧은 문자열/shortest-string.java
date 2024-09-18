import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        int s1 = str1.length();
        int s2 = str2.length();
        int s3 = str3.length();

        int big = s1;
        if(big<s2){
            big=s2;
        }
        if(big<s3){
            big=s3;
        }

        
        int sm = s1;
        if(sm>s2){
            sm=s2;
        }
        if(sm>s3){
            sm=s3;
        }
        System.out.print(big-sm);
    }
}