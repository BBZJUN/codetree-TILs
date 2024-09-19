import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String cut = sc.next();
        for ( ; ; ){
            if (s.contains(cut)){
                int loc = s.indexOf(cut);
                s=s.substring(0,loc)+s.substring(loc+1,s.length());
            }
            else{
                break;
            }
            
        }
        System.out.println(s);
    }
}