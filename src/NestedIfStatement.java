import java.util.Scanner;

public class NestedIfStatement {

    /**
     * NESTED IFS:
     * To qualify for a loan, a person must make at least $30,000
     * and have been working at their current job for at least 2 years.
     */

    public static void main(String[] args) {

        //Initialize what we know
        int minYearsAtWork = 2;
        int minSalary = 30000;
        //Get values we don't know
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your yearly salary: ");
        double yearlySalary = scan.nextDouble();
        System.out.println("How long you have been working at your current position?: ");
        int yearsAtWork = scan.nextInt();
        scan.close();
        //Make a decision
        if (yearlySalary >= minSalary){
            if (yearsAtWork >= minYearsAtWork){
                System.out.println("You are qualified for loan");
            }else{
                System.out.println("Sorry, you must have worked ar your current job "+ minYearsAtWork+ " years.");
        }
        }else {
            System.out.println("Sorry, you must earn at least $"+minSalary+" a year. to qualify");
        }
    }
}
