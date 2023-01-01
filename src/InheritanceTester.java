import chap9.*;
import chap9.Rectangle;

public class InheritanceTester {

    public static void main(String[] args) {
        Employee employee = new Employee();
        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("James");

    }


}
