public class Square extends Rectangle{
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side); 
    }

    public double getSide() {
        return getWidth();
    }

    @Override
    public String toString(){
        return "A Square with side="+ getSide() + ", which is a subclass of " + super.toString();
    }
}