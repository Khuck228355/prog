package problems;

import java.util.Random;

public class task_13_2 {
    public static void main(String[] args) {
        int a, i, sum=0;
        for (i=1; i<=20; i++) {
            a = new Random().nextInt(100);
            sum=sum+a;
            System.out.print(a+" ");
        }
        System.out.print("\n"+sum);
    }
}
