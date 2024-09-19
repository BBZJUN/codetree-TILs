import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String q = sc.next();
        char[] arr = q.toCharArray();
        for (int i=0 ;i<q.length(); i++){
            if (arr[i]=='L'){
                s= s.substring(1,s.length())+s.substring(0,1);
            }
            else if(arr[i]=='R'){
                s= s.substring(s.length() - 1,s.length())+s.substring(0,s.length()-1);
            }
        }
        System.out.print(s);
    }
}