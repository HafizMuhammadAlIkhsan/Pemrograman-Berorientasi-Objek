public class App {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println("\nShape1 "
        + "\n Color = " + shape1.getColor() 
        + "\n Shape = " + shape1.getFilled() 
        + "\n Text  = " + shape1.toString());

        Shape shape2 = new Shape("merah", false);
        System.out.println("\nShape2 "
        + "\n Color = " + shape2.getColor() 
        + "\n Shape = " + shape2.getFilled() 
        + "\n Text  = " + shape2.toString());

        Circle circle = new Circle(2.5);
        System.out.println("\ncircle");
        System.out.println(" Area: " + circle.getArea());
        System.out.println(" Perimeter: " + circle.getPerimeter());
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle(3.0, 4.0);
        System.out.println("\nrectangle"); 
        System.out.println(" Area: " + rectangle.getArea()); 
        System.out.println(" Perimeter: " + rectangle.getPerimeter()); 
        System.out.println(rectangle.toString());


        Square square = new Square(5.0);
        System.out.println("\nsquare"); 
        System.out.println(" Area: " + square.getArea()); 
        System.out.println(" Perimeter: " + square.getPerimeter());
        System.out.println(square.toString());

    }

}