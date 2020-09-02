import java.util.ArrayList;
import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        ArrayList<String> list = new ArrayList<>();

        String[] mnum = Integer.toString(m).split("");
        String[] nnum = Integer.toString(n).split("");

        for(String sm : mnum){
            for (String sn : nnum){
                if(sn.equals(sm)){
                    if(!list.contains(sn))
                        list.add(sn);
                }

            }
        }

        System.out.println("Цифры в обоих числах "+list);
    }
}
