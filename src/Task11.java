import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double F;
        if (x>3)
            F=1/(x*x*x+6);
        else
            F=x*x-3*x+9;
        System.out.println(F);
    }
}
