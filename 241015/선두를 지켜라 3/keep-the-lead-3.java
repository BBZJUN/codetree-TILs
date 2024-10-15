import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 받기
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[][] A = new int[N][2]; // A의 속도와 시간 정보
        int[][] B = new int[M][2]; // B의 속도와 시간 정보
        
        for (int i = 0; i < N; i++) {
            A[i][0] = sc.nextInt(); // 속도
            A[i][1] = sc.nextInt(); // 시간
        }
        
        for (int i = 0; i < M; i++) {
            B[i][0] = sc.nextInt(); // 속도
            B[i][1] = sc.nextInt(); // 시간
        }
        
        int aIndex = 0, bIndex = 0; // A와 B의 현재 이동 구간 인덱스
        int aPosition = 0, bPosition = 0; // A와 B의 현재 위치
        int aTimeLeft = A[aIndex][1], bTimeLeft = B[bIndex][1]; // 남은 시간
        int lastLeader = 0; // 마지막 선두 (0: 동점, 1: A, 2: B)
        int changes = 0; // 명예의 전당 변경 횟수
        int currentTime = 0; // 현재까지 진행된 총 시간
        
        while (aIndex < N && bIndex < M) {
            int timeStep = Math.min(aTimeLeft, bTimeLeft); // 이번 구간에서 진행할 시간
            
            // A와 B의 위치를 시간 구간 동안 업데이트
            aPosition += A[aIndex][0] * timeStep;
            bPosition += B[bIndex][0] * timeStep;
            currentTime += timeStep; // 현재 시간을 업데이트
            
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
            
            // 시간이 지난 후 각자의 남은 시간을 업데이트
            aTimeLeft -= timeStep;
            bTimeLeft -= timeStep;
            
            // A의 현재 구간이 끝났다면 다음 구간으로 이동
            if (aTimeLeft == 0 && aIndex < N - 1) {
                aIndex++;
                aTimeLeft = A[aIndex][1];
            }
            
            // B의 현재 구간이 끝났다면 다음 구간으로 이동
            if (bTimeLeft == 0 && bIndex < M - 1) {
                bIndex++;
                bTimeLeft = B[bIndex][1];
            }
        }
        
        // 결과 출력
        System.out.println(changes);
    }
}