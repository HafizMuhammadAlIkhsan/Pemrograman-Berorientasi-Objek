import java.util.Scanner;

public class soal1 {
    public static void main (String[] args) {

        String input;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Kalimat: ");
        input = scan.nextLine();

        String[] str = input.split("[ ',.!?_@]+");

        System.out.println(str.length);

        for (String s : str) {
            System.out.println(s);
        }
    }
}


