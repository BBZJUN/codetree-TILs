import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] r = new int[b];
        int check = 0;
        int sum=0;
        int x= 0;
        for (int i = 0; ;i++){
            r[a%b]++;
            a=a/b;
            if (a<=1){
                check = i;
                break;
            }
        }
        for (int i=0;i<check;i++){
            if(i==0){
                if(r[0]>=1){
                    sum=sum+1;
                }
            }
            else{
                if(r[i]!=0)
                {   
                    x=1;
                    for (int j=0;j<r[i];j++){
                        x=x*2;
                    }
                }
                else{
                    x=0;
                }
                sum=sum+x;
                
            }
        }
        System.out.print(sum);
        
    }
}