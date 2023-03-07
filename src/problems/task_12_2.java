package problems;
import java.util.Scanner;

public class task_12_2 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, i;
        a=0;
        b=0;
        for (i=1; i<=15; i++)
        {
            c=reader.nextInt();
            if (c%2==0) a++;
            else b++;
        }
        System.out.printf("Четных чисел: %d. Нечетных чисел: %d.", a, b);
    }
}
