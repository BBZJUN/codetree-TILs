import java.util.Scanner;


class cl{

    String a;
    char b;
    int c;

    public cl(String a, char b, int c){
        this.a = a;
        this.b = b;
        this.c = c; 
    }
    public void print(){
        System.out.println("code : "+this.a);
        System.out.println("color : "+this.b);
        System.out.println("second : "+this.c);
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        char b = sc.next().charAt(0);
        int c = sc.nextInt();
        cl bom = new cl(a,b,c);
        bom.print();
    }
}