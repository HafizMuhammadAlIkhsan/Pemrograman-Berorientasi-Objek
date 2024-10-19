import java.util.Scanner;

public class soal2 {

    public static void main(String[] args) {
        String[] string = new String[3];
        int[] number = new int[3];

        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 3; i++) {
                string[i] = sc.next();
                number[i] = sc.nextInt();
                
            }
            System.out.println("====================");
            for (int i = 0; i < 3; i++) {
                System.out.printf("%-15s%03d%n", string[i], number[i]);
            }
            System.out.println("====================");
        }
    }
}



