import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();

        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalAre(kitchen, bathroom);
        System.out.println("The total area is: " + area);
        calculator.scanner.close();

    }

    public Rectangle getRoom() {

        System.out.println("Enter the length of your room: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of your room: ");
        double width = scanner.nextDouble();

        return new Rectangle((int) length, (int) width);

    }

    public double calculateTotalAre(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calculateAre() + rectangle2.calculateAre();
    }
}
