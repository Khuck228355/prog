package problems;
import java.util.Random;
import java.util.Scanner;

public class task_14_8 {
    public static void main(String[] args) {
        int a, b, c, i, sum, min=100;
        a = 100;
        b = 999;
        for (i=1; i<=15; i++)
        {
            c = new Random().nextInt(b-a)+a;
            System.out.print(c+" ");
            sum=c/100+(c/10)%10+c%10;
            if (sum<min) min=sum;
        }
        System.out.print("\n"+min);
    }
}
