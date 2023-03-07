import java.util.Scanner;

public class task_4_4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int x0=x.nextInt();
        System.out.println(x0%10 + " " + (x0/10)%10 + " " + (x0/100));
    }
}
