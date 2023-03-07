package problems;
import java.util.Scanner;
public class task_15_7 {
    static Scanner reader = new Scanner(System.in);
    public static  void  main(String[] args){

        System.out.print("Введите число: ");
        int a=0;
        while (a!=123){
            a = reader.nextInt();
            if (a!=123)
                System.out.println("Код неверный, повторите ввод.");
            else
                System.out.println("Код принят");
        }
    }
}
