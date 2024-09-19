import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String aa ="";
        String bb = "";
        int tmp = 0;
        for (int i=0; i<a.length(); i++){
            if (a.charAt(i)>='0' &&a.charAt(i)<='9'){
                tmp = 1;
                aa+=a.charAt(i);
            }
            else{
                if(tmp==1){
                    break;
                }
            }
        }

        tmp = 0;

        for (int i=0; i<b.length(); i++){
            if (b.charAt(i)>='0' &&b.charAt(i)<='9'){
                tmp = 1;
                bb+=b.charAt(i);
            }
            else{
                if(tmp==1){
                    break;
                }
            }
        }

        System.out.print(Integer.parseInt(a)+Integer.parseInt(b));
        
    }
}