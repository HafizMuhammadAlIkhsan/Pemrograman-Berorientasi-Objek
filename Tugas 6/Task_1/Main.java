public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        System.out.println(circle1.toString());
        System.out.println("Area of circle1: " + circle1.getArea());

        Circle circle2 = new Circle(7.0, "merah");
        System.out.println(circle2.toString());
        System.out.println("Area of circle2: " + circle2.getArea());
    }
}