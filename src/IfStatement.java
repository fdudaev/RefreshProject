import java.util.Scanner;

public class IfStatement {
    /**
     * IF Statement.
     * All salespeople get a payment of $1000 a week.
     * Salespeople who exceed 10 sales get an additional bonus of $250
     */
    public static void main(String[] args) {
        // Initialize known values
        int salary = 1000;
        int bonus = 250;
        int sales = 10;
        // Get values for unknown
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number opf sales for this week: ");
        int numberOfSales = scan.nextInt();

        // Quick detour for bonus
        if (numberOfSales > sales ){
            salary = salary + bonus;
        }
        // Output
        System.out.println("Salary for this week is: $" + salary);
    }
}
