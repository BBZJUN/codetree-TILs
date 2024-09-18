import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = new String();
        for (int i=0; i<str.length(); i++){
            int c = 0;
            if (i==0 || i>0&&str.charAt(i)!=str.charAt(i-1)){
                for (int j=i; j<str.length() ; j++){
                    if (str.charAt(i)==str.charAt(j)){
                        c++;
                    }
                    else{
                        break;
                    }
                }
                result = result + str.charAt(i) + c;
            }
        }
        System.out.println(result.length());
        System.out.print(result);
        // 여기에 코드를 작성해주세요.
    }
}