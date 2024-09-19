import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] arr = a.toCharArray();
        int s=0;
        for(int i=0; i<a.length(); i++){
            if(arr[i]>='0' && arr[i]<='9'){
                s+=(int)(arr[i]-'0');
            }
        }
        System.out.print(s);
        
    }
}