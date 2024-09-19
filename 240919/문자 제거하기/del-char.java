import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for ( ; ; ){
            if (s.length()==1){
                break;
            }
            int x = sc.nextInt();
            if(x>=s.length()-1){
                s=s.substring(0,s.length()-2);
            }
            else{
                s=s.substring(0,x)+s.substring(x+1,s.length());
            }
            System.out.println(s);
        }
    }
}