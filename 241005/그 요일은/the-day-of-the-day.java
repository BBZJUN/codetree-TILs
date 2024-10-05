import java.util.Scanner;

public class Main {
    public static int numOfDays(int m, int d) {
        // 계산 편의를 위해 월마다 몇 일이 있는지를 적어줍니다. 
        int[] days = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;
        
        // 1월부터 (m - 1)월 까지는 전부 꽉 채워져 있습니다.
        for(int i = 1; i < m; i++)
            totalDays += days[i];
        
        // m월의 경우에는 정확이 d일만 있습니다.
        totalDays += d;
        
        return totalDays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 선언 및 입력
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        String c = sc.next();
        
        // 두 날짜간의 차이가 몇 일인지를 구합니다.
        int diff = numOfDays(m2, d2) - numOfDays(m1, d1);

        int d = diff/7;
        int dd = diff%7;

        
        if (dd>=1 && c.equals("Tue") ){
            d++;
        }
        else if(dd>=2 && c.equals("Wed")){
            d++;
        }
        else if(dd>=3 && c.equals("Thu")){
            d++;
        }
        else if(dd>=4 && c.equals("Fri")){
            d++;
        }
        else if(dd>=5 && c.equals("Sat")){
            d++;
        }
        else if(dd>=6 && c.equals("Sun")){
            d++;
        }

        System.out.print(d);
    }
}