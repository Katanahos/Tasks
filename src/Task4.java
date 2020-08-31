import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        int a = (int) x;
        double drob = x - a;
        double answer = drob * 1000 + ((double) a / 1000);
        System.out.format("%.3f%n", answer);

    }
}

