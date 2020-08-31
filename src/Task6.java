import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        boolean obl = false;

        if(y<=4&y>=0){
            if(x>=-2&x<=2)
                obl=true;
        }

        if (y==-1&x==0) {
        }
        else if(y<=0&y>=-3){
            if(x>=-4&x<=4)
                obl=true;
        }
        System.out.println(obl);
    }
}
