import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int q = sc.nextInt();
        char[] arr = s.toCharArray();
        for (int i=0 ; i<q; i++){
            int n = sc.nextInt();
            if (n==1){
                int A = sc.nextInt();
                int B = sc.nextInt();
                
                char tmp = arr[A-1];
                arr[A-1] = arr[B-1];
                arr[B-1] = tmp;
                s = String.valueOf(arr);
            }
            else if (n==2){
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);

                for (int k=0; k<s.length();k++){
                    if(arr[k]==a){
                        arr[k]=b;
                    }
                    
                }
                s = String.valueOf(arr);
            }
            System.out.println(s);
        }
    }
}