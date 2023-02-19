import java.util.Scanner;

public class task_3_3_d {
    public static void main(String[] args){
        Scanner x = new Scanner (System.in);
        System.out.println("Введите число q: ");
        int q = x.nextInt();
        System.out.println("Введите число w: ");
        int w = x.nextInt();
        System.out.println("Результат деления: " + q/w + ", остаток: "+ q%w);
    }
}
