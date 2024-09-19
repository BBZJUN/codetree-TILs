import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] arr = a.toCharArray();
        for(int i=0; i<a.length(); i++){
            if (arr[i]>='a' && arr[i]<='z'){
                System.out.print(arr[i]);
            }
            else if (arr[i]>='A' && arr[i]<='Z'){
                
                System.out.print((char)(arr[i]+32));
            }
            else if{(arr[i]>='0' && arr[i]<='9')
                System.out.print(arr[i]);
            }
        }
        
    }
}