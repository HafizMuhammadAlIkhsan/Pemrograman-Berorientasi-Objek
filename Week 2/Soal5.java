import java.util.Scanner;

public class Soal5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Kata: ");
        String str1 = scan.nextLine();
        System.out.print("Masukan Kata: ");
        String str2 = scan.nextLine();

        int sum = str1.length() + str2.length();

        System.out.println(sum);
        if (str1.compareTo(str2) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String capitalizedA = str1.substring(0, 1).toUpperCase() + str1.substring(1);
        String capitalizedB = str2.substring(0, 1).toUpperCase() + str2.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);

        scan.close();
    }
}


