import java.io.InputStreamReader;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) throws Exception {
        InputStreamReader reader = new InputStreamReader(System.in);
        char simvol = (char) reader.read();
        String kod = Integer.toBinaryString(simvol);
        System.out.println(kod);
    }

}
