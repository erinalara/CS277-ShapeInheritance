
public class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    public Triangle(String n) {
        super(n);
    }

    public double getPerimeter() {
        super.getPerimeter();
        return side1 + side2 + side3;
    }

    public double getArea() {
        super.getArea();
        double s = 0.5 * getPerimeter();
        return (Math.sqrt(s * ( (s-side1)*(s-side2)*(s-side3))));
    }


}
