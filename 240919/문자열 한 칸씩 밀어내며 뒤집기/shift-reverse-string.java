import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int q = sc.nextInt();
        System.out.println(s);
        for (int i=0 ;i<q; i++){
            int n = sc.nextInt();
            if (n==1){
                s=s.substring(1,s.length())+s.substring(0,1);
            }
            else if(n==2){
                s=s.substring(s.length()-1,s.length())+s.substring(0,s.length()-1);
            }
            else if(n==3){
                String tmp ="";
                for (int k=s.length(); k>0 ;k--){
                    tmp=tmp+s.substring(k-1,k);
                }
                s=tmp;
            }
            
            System.out.println(s);
        }
    }
}