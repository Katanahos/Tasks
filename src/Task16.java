import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double e = scanner.nextDouble();
        double n =scanner.nextDouble();
        double sum = 0;
        for(double i = x;i<y; ){
            if (Math.abs(i)>=e)
                sum+=i;
            i += 1/(Math.pow(2,n)+1/(Math.pow(3,n)));
        }
        System.out.println(sum);
    }
}
