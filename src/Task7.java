import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean exist = false, pryamo = false;
        String answer = "";

        if (a + b == 90)
            pryamo = true;
        else if ((a + b) < 180)
            exist = true;

        if (pryamo)
            answer = "Существующий прямоугольный триугольник";
        else if (exist)
            answer = "Существующий треугольник";
        else
            answer = "Треугольник не существует";
        System.out.println(answer);
    }

}
