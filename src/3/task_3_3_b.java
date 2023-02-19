import java.util.Scanner;

public class task_3_3_b {
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        System.out.println("Первое число: ");
        int n1 = x.nextInt();
        System.out.println("Второе число: ");
        int n2 = x.nextInt();
        int sum = n1 + n2;
        System.out.println("Сумма равна: "+sum);
    }
}
