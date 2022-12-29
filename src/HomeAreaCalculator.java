/**
 * Write a class that creates instance of the Rectangle class to find the
 * total area of two rooms in the house
 */

public class HomeAreaCalculator {
    public static void main(String[] args) {

        /********************************
         * RECTANGLE 1
         *******************************/

        Rectangle room1 = new Rectangle();

        room1.setWidth(25);
        room1.setLength(50);

        double areOfRoom1 = room1.calculateAre();

        /********************************
         * RECTANGLE 2
         *******************************/

        Rectangle room2 = new Rectangle(45, 55);
        double areaOfRoom2 = room2.calculateAre();
        double totalAre = areOfRoom1 + areaOfRoom2;

        System.out.println("Total area of both rooms are "+totalAre);

    }


}
