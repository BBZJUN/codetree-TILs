import java.util.Scanner;

class IntW{
    int val;

    public IntW(int val){
        this.val = val;
    }
}

public class Main {

    public static void f(IntW a, IntW b){
        
        if (a.val > b.val){
            a.val*=2;
            b.val+=10;
        }
        else{
            b.val*=2;
            a.val+=10;
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        IntW a = new IntW(sc.nextInt());
        IntW b = new IntW(sc.nextInt());
        f(a,b);
        System.out.print(a.val+" "+b.val);
        
    }
}