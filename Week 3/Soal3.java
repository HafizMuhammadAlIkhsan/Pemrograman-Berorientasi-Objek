import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        String parts[] = input.split(" ");
        
        int A = Integer.parseInt(parts[0]);
        String operator = parts[1];
        int B = Integer.parseInt(parts[2]);
        
        int result = 0;
        switch (operator) {
            case "+":
                result = A + B;
                break;
            case "-":
                result = A - B;
                break;
            case "*":
                result = A * B;
                break;
            case "/":
                if (B != 0) {
                    result = A / B;
                } else {
                    System.out.println("Hasil tidak terdefinisi");
                    return;
                }
                break;
            case "%":
                if (B != 0) {
                    result = A % B;
                } else {
                    System.out.println("Hasil tidak terdefinisi");
                    return;
                }
                break;
            default:
                System.out.println("Input tidak valid");
                return;
        }
    
        System.out.println(result);
    }
}


