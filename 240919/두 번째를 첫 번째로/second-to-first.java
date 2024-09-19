import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char a = sc.charAt(0);
        char b = sc.charAt(1);
        char[] arr = s.toCharArray();
        for (int k=1; k<s.length();k++){
            if(arr[k]==b){
                arr[k]=a;
            }
                    
        }
            
        s = String.valueOf(arr);
        System.out.println(s);
        
    }
}