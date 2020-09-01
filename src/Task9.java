import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        boolean line = false;

        if (Math.tan((y2 - y1) / (x2 - x1)) == Math.tan((y3 - y2) / (x3 - x2))) {
            line = true;
        }
        System.out.println(line);
    }
}
