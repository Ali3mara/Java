public class Circle extends Shape {

    public Circle(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
    
}
