import java.lang.Math.*;

public class Circle extends GeometricObject {

    private int radius;

    public Circle(){

        radius = 1;
    }

    public Circle(int r){

        radius = r;
    }

    public int getRadius(){

        return radius;
    }

    public double getArea(){

        return 3.14 * (radius * radius);
    }

    public double getPerimeter(){
        super.getPerimeter();
        return 2 * Math.PI * radius;
    }

    public void getDiameter(){

        System.out.println(radius * 2);
    }
}
