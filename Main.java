import java.util.*;

public class Main {

    public static void main (String[] args){

        ArrayList <GeometricObject> go = new ArrayList<>();

        GeometricObject thing1 = new Circle(10);

        go.add(thing1);
        go.add(new Circle(5));
        go.add(new Rectangle(3, 3));
        go.add(new Triangle());

        for (int i = 0; i < go.size(); i++){

            GeometricObject thingy = go.get(i);
            //System.out.println(thingy);
            System.out.println(thingy.getArea());
            System.out.println(thingy.getPerimeter());

            if (thingy instanceof Circle){

                thingy.getDiameter();
            }

        }
    }


}
