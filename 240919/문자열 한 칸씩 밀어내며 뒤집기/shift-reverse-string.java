import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int q = sc.nextInt();
        for (int i=0 ;i<q; i++){
            int n = sc.nextInt();
            if (n==1){
                s=s.substring(1,s.length())+s.substring(0,1);
            }
            else if(n==2){
                s=s.substring(s.length()-1,s.length())+s.substring(0,s.length()-1);
            }
            else if(n==3){
                char[] arr = s.toCharArray();
                for (int k=0; k<s.length()/2 ;k++){
                    char tmp = arr[k];
                    arr[k] = arr[s.length()-1-k];
                    arr[s.length()-1-k] = tmp;
                }
                s=String.valueOf(arr);
            }
            
            System.out.println(s);
        }
    }
}