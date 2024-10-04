import java.util.Scanner;

// Person 정보를 나타내는 클래스 선언
class W {
    String date;
    String day;
    String weth;

    public W(String date, String day, String weth){
        this.date = date;
        this.day = day;
        this.weth = weth;
    }
};

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        W[] www = new W[n];

        for(int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weth = sc.next();
            
            // 객체 생성 및 리스트에 추가
            www[i] = new W(date, day, weth);
        }
        

        int fa = 0;
        for(int i = 1; i < n; i++) {
            //System.out.println(www[i].weth);
            if(www[i].date.compareTo(www[fa].date) < 0 && www[i].weth.compareTo("Rain ")==0)
                fa = i;
        }

        // 결과를 출력합니다.
        System.out.print(www[fa].date+" "+www[fa].day+" "+www[fa].weth);
    }
}