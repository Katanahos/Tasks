import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        for (int i = m; i <= n; i++) {
            StringBuilder deliteli = new StringBuilder();
            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0)
                    deliteli.append(j).append(" ");
            }
            System.out.println("Делители для " + i + ": " + deliteli);
        }
    }
}
