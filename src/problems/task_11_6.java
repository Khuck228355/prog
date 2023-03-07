package problems;

import java.util.Random;
import java.util.Scanner;

public class task_11_6 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, i;
        a = reader.nextInt();
        b = reader.nextInt();
        for (i=1; i<=20; i++)
        {
            c = new Random().nextInt(b-a)+a;
            System.out.print(c+" ");
        }
    }
}
