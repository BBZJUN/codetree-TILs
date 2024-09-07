import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int q = sc.nextInt();
        int[] arrn = new int[n];
        int check = 0;
        int q3 = 0;

        for (int i = 0; i<n;i++){
            arrn[i]=sc.nextInt();
        }

        for (int i = 0; i<q;i++){
            int q1 = sc.nextInt();
            int q2 = sc.nextInt();
            if(q1==3){
                q3= sc.nextInt();
            }
            if(q1==1){
                System.out.println(arrn[q2-1]);
            }
            if(q1==2){
                check = 0;
                for (int k=0;k<n;k++){
                    if(arrn[k]==q2){
                        System.out.println(k+1);
                        check = 1;
                        break;
                    }
                }
                if(check==0){
                    System.out.println(0);
                }

            }
            if(q1==3){
                for (int k=q2-1;k<=q3-1;k++){
                    System.out.print(arrn[k]+" ");
  
                }
                System.out.println();
            }

        }
    }
}