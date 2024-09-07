import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 받기
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // 나머지가 등장한 횟수를 기록할 배열
        int[] remainderCount = new int[b];
        
        // 나눗셈 반복
        while (a > 1) {
            int remainder = a % b;  // 나머지 계산
            remainderCount[remainder]++;  // 나머지 등장 횟수 증가
            a = a / b;  // 몫을 a에 저장
        }
        
        // 나머지 등장 횟수의 제곱의 합 계산
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += remainderCount[i] * remainderCount[i];  // 각 나머지 등장 횟수 제곱
        }
        
        // 결과 출력
        System.out.println(sum);
        
        sc.close();
    }
}