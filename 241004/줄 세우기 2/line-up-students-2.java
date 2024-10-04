import java.util.Scanner;
import java.util.Arrays;


class X implements Comparable<X> {
    int k;
    int m;
    int index;

    public X(int k, int m, int index) {
        this.k = k;
        this.m = m;
        this.index = index;
    }

    @Override
    public int compareTo(X b) {

        if(this.k != b.k)
            return this.k - b.k;

        return b.m - this.m;
    }
};

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        X[] arr = new X[n];

        for(int i = 0; i < n; i++) {
            int k = sc.nextInt();
            int m = sc.nextInt();
            arr[i] = new X(k, m,(i+1));
        }


        Arrays.sort(arr);


        for(int i = 0; i < n; i++) 
            System.out.println(arr[i].k+" "+arr[i].m+" "+arr[i].index);

    }
}