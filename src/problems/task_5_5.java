import java.util.Scanner;

public class task_5_5 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Введите x:");
        int x=i.nextInt();
        System.out.println("Введите y:");
        int y=i.nextInt();
        System.out.println("Введите z:");
        int z=i.nextInt();
        System.out.println(((z>x)||(x<0))&&(z-y>9));
    }
}