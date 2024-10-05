import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  // 직사각형 개수
        
        // 좌표평면을 201 x 201 크기의 배열로 설정 (-100 ≤ x, y ≤ 100)
        int[][] plane = new int[201][201];
        
        // 직사각형 입력 처리
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            
            // 배열 인덱스는 좌표가 [-100, 100] 범위이므로 +100을 해서 변환
            x1 += 100;
            y1 += 100;
            x2 += 100;
            y2 += 100;
            
            // 현재 직사각형이 빨간색(0)인지 파란색(1)인지 결정
            int color = (i % 2 == 0) ? 0 : 1;  // 빨간색(0), 파란색(1)
            
            // 직사각형의 영역을 color로 칠함
            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    plane[x][y] = color;
                }
            }
        }
        
        // 파란색 영역의 넓이 계산
        int blueArea = 0;
        for (int x = 0; x < 201; x++) {
            for (int y = 0; y < 201; y++) {
                if (plane[x][y] == 1) {  // 파란색인 경우
                    blueArea++;
                }
            }
        }
        
        // 결과 출력
        System.out.println(blueArea);
    }
}