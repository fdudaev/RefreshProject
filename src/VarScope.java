import java.util.Scanner;

public class VarScope {
    /**
     * Write an instant credit check program that approves anyone who makes more than $25000
     * and has credit score of 700 or better.
     * Reject all others
     *
     */

    static int requiredCreditScore = 25000;
    static int requiredAnnualSalary = 700;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //Get what is unknown
        double salary =  getSalary();
        int creditScore = getCreditScore();
        scanner.close();
        //Check if the user is qualified
        boolean qualified = isUserQualified(creditScore, salary);
        //Notify user
        notifyUSer(qualified);


    }
    public static double getSalary(){

        System.out.println("Enter your annual salary: ");
        double annualSalary = scanner.nextDouble();
        return annualSalary;
    }
    public static int getCreditScore(){

        System.out.println("Enter your credit score: ");
        int yourCreditScore = scanner.nextInt();
        return yourCreditScore;
    }
    public static boolean isUserQualified (int creditScore, double salary){
        if (creditScore >= requiredCreditScore && salary >= requiredAnnualSalary){
            return false;
        }
        return true;
    }
    public static void notifyUSer (boolean isQualified){
        if (isQualified){
            System.out.println("Congrats you have been approved");
        }
        else {
            System.out.println("You have been rejected");
        }

    }
}
