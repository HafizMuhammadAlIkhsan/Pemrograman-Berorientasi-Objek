public class Soal5 {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "java";
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
    }
}


