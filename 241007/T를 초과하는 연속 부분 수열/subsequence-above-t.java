import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 수열의 길이
        int t = sc.nextInt(); // 기준이 되는 정수 t
        int count = 0; // 현재 연속 부분 수열의 길이
        int max = 0; // 최대 연속 부분 수열의 길이
        
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt(); // 수열의 원소를 하나씩 입력받음
            
            if (k > t) {
                // t보다 크면 연속 부분 수열에 포함됨
                count++;
                max = Math.max(count, max); // 최대 길이를 업데이트
            } else {
                // t보다 작으면 연속이 끊기므로 길이를 0으로 초기화
                count = 0;
            }
        }
        
        // 결과 출력, 만약 max가 0이면 그러한 수열이 없는 것이므로 0 출력
        System.out.println(max);
    }
}