import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a1 = scanner.nextDouble();
        double b = scanner.nextDouble();
        double h = scanner.nextDouble();


        for (double a = a1; a < b; a += h) {
            double y;
            if (a <= 2)
                y = -a;
            else {
                y = a;
            }
            System.out.println("при Х равным " + a + "Y равен " + y);
        }

    }
}
