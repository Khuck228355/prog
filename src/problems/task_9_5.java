package problems;
import java.util.Scanner;
public class task_9_5 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Bвeди квартиру=");
        int a, b, c;
        a = reader.nextInt();
        b = (a / 3) + 1;
        c = a % 3;
        if (c == 1)
            System.out.printf("Этаж: %d. Квартира находится слева", b);
        if (c == 2)
            System.out.printf("Этаж: %d. Квартира находится в центре", b);
        if (c == 0)
            System.out.printf("Этаж: %d. Квартира находится справа", b);
    }
}
