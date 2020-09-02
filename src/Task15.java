import java.math.BigInteger;

public class Task15 {
    public static void main(String[] args) {
        BigInteger sum = BigInteger.valueOf(1);
        int kvadr;
        for (int i = 1; i <= 200 ; i++) {
            kvadr = i*i;
            BigInteger x = BigInteger.valueOf(kvadr);
            sum = sum.multiply(x);
        }
        System.out.println(sum);
    }
}
