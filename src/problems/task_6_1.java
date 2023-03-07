import java.util.Scanner;
public class task_6_1
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        int y = reader.nextInt();
        if (x < y) System.out.println("x меньше y");
        if (x == y) System.out.println("x теперь равна y");
        if (x > y) System.out.println("x теперь больше y");
}
}