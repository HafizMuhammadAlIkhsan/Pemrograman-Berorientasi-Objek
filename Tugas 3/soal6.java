import java.math.BigInteger;
import java.util.Scanner;

public class soal6 {
    public static void main(){
    BigInteger number1, number2;

        try (Scanner scan = new Scanner(System.in)) {
            number1 = scan.nextBigInteger();
            number2 = scan.nextBigInteger();
        }

        System.out.println("\n" + number1.add(number2));
        System.out.println(number1.multiply(number2));
    }
}


