import java.util.Scanner;

public class Main {    
    // a가 3n + 1 수열을 총 몇번 반복해야 1이 되는지 반환합니다.
    public static int countNumber(int a, int c) {
        if(a == 1)
            return c;
    
        if(a % 2 == 0)
            return countNumber(a / 2,c+=1);
        else
            return countNumber(3 * a + 1, c+=1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 선언 및 입력:
        int n = sc.nextInt();

        System.out.print(countNumber(n,0));
    }
}