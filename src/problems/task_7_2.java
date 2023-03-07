package problems;

import java.util.Scanner;

public class task_7_2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a=reader.nextInt();
        int digit1=a/10;
        int digit2=a%10;
        if (digit1==digit2) System.out.println("Число состоит из одинаковых цифр");
        else System.out.println("Число не состоит из одинаковых цифр");
    }
}
