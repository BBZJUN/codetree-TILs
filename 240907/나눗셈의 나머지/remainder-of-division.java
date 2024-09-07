import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // 나머지의 등장 횟수를 저장할 배열
        int[] r = new int[b];
        
        // 나눗셈 반복
        while (a > 0) {
            int remainder = a % b;
            r[remainder]++; // 나머지 등장 횟수 증가
            a = a / b; // 몫을 다시 a로 저장
        }
        
        // 나머지 등장 횟수의 제곱의 합을 계산
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += r[i] * r[i]; // 각 나머지의 등장 횟수 제곱의 합
        }
        
        // 결과 출력
        System.out.println(sum);
    }
}