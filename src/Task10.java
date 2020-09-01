import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        boolean answer = false;

        int min = Math.min(Math.min(x, y), z);
        int average = 0;
        if (x >= y & x <= z)
            average = x;
        else if (y >= z & y <= x)
            average = y;
        else if (z >= x & z <= y)
            average = z;
        if (A > min & B > average) {
            answer = true;
        }


        System.out.println(answer);
    }
}
