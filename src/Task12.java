import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        long sum;
        if (a > 0) {
            sum = 0;
            for (int i = 0; i < a; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}
