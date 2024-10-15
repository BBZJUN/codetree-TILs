import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 받기
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[][] A = new int[N][2];
        int[][] B = new int[M][2];
        
        for (int i = 0; i < N; i++) {
            A[i][0] = sc.nextInt(); // 속도
            A[i][1] = sc.nextInt(); // 시간
        }
        
        for (int i = 0; i < M; i++) {
            B[i][0] = sc.nextInt(); // 속도
            B[i][1] = sc.nextInt(); // 시간
        }
        
        // A와 B의 현재 위치
        int aPosition = 0;
        int bPosition = 0;
        
        // A와 B가 각각 이동하는 시간에 대한 인덱스
        int aIndex = 0;
        int bIndex = 0;
        
        // A와 B의 현재 남은 시간
        int aTimeLeft = A[aIndex][1];
        int bTimeLeft = B[bIndex][1];
        
        // 초기 선두 (동점으로 시작할 수 있으므로 설정 필요)
        int lastLeader = 0; // 0: 동점, 1: A가 선두, 2: B가 선두
        int changes = 0;
        
        // 총 시간 동안 반복 (A와 B가 총 이동한 시간은 동일하다고 가정)
        while (aIndex < N && bIndex < M) {
            // 현재 이동할 시간(최소 남은 시간)
            int currentTime = Math.min(aTimeLeft, bTimeLeft);
            
            // A와 B의 현재 속도로 해당 시간 동안 이동
            aPosition += A[aIndex][0] * currentTime;
            bPosition += B[bIndex][0] * currentTime;
            
            // 현재 선두를 결정
            int currentLeader;
            if (aPosition > bPosition) {
                currentLeader = 1; // A가 선두
            } else if (aPosition < bPosition) {
                currentLeader = 2; // B가 선두
            } else {
                currentLeader = 0; // 동점
            }
            
            // 선두가 바뀌었는지 확인
            if (currentLeader != lastLeader) {
                changes++;
                lastLeader = currentLeader;
            }
            
            // 시간이 흐른 후 A와 B의 남은 시간을 갱신
            aTimeLeft -= currentTime;
            bTimeLeft -= currentTime;
            
            // A의 현재 이동이 끝났다면 다음 구간으로 넘어감
            if (aTimeLeft == 0 && aIndex < N - 1) {
                aIndex++;
                aTimeLeft = A[aIndex][1];
            }
            
            // B의 현재 이동이 끝났다면 다음 구간으로 넘어감
            if (bTimeLeft == 0 && bIndex < M - 1) {
                bIndex++;
                bTimeLeft = B[bIndex][1];
            }
        }
        
        // 결과 출력
        System.out.println(changes);
    }
}