import java.util.Scanner;

public class BasicClass {
    /**
     * 1. Get the number of hours worked
     * 2. Get the hourly rate
     * 3. Multiply hours and rate
     * 4. Display the result
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of hours the employee worked: ");
        double hoursWorked = scan.nextDouble();
        System.out.println("Enter the employee's hourly rate: ");
        double hourlyRate = scan.nextDouble();
        double grossPay = hoursWorked * hourlyRate;
        System.out.println("The employee's gross pay is: $"+grossPay);


    }
}
