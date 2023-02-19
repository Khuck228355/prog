import java.util.Scanner;

public class task_3_3_c {
    public static void main(String[] args){
        Scanner i = new Scanner (System.in);
        System.out.println("Введите число: ");
        int x = i.nextInt();
        System.out.println("Сумма цифр равна "+((x%10)+((x/10)%10)+(x/100)));
    }
}
