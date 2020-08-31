import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        int hour = T/3600;
        int minutes = (T%3600)/60;
        int seconds = T-(hour*3600+minutes*60);

        System.out.println(hour+"ч "+minutes+"мин "+seconds+"c.");
    }
}
