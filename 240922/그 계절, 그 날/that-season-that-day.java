import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();
        System.out.printf("%s",f(Y,M,D));
    }


    public static String f(int Y, int M, int D){
        if (M==1 || M==3 || M==5 || M==7 || M==8 || M==10 || M==12){
            if (D>=1 && D<=31){
                if(M==12 || M==1){
                    return "Winter";
                }
                if (M==3 || M==5){
                    return "Spring";
                }
                if (M==7 || M==8){
                    return "Summer";
                }
                if (M==10){
                    return "Fall";
                }

            }
            else{
                return "-1";
            }
        }
        else if (M==2){
            if(Y%4==0 && Y%100!=0 || Y%400==0){
                if (D>=1 && D<=29){
                    return "Winter";
                }
            }
            else{
                if (D>=1 && D<=28){
                    return "Winter";
                }
            }

        }
        else if (M==4 || M==6 || M==9 || M==11){
            if (D>=1 && D<=30){
                if (M==4){
                    return "Spring";
                }
                if (M==6){
                    return "Summer";
                }
                if (M==9 || M==11){
                    return "Fall";
                }

            }
            else{
                return "-1";
            }

        }
        else{
            return "-1";
        }
        return "-1";

    }

}