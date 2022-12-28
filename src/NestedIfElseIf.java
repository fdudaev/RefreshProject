import java.util.Scanner;

public class NestedIfElseIf {

    public static void main(String[] args) {

        // Get the test score
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the test score: ");
        int testScore = scan.nextInt();
        scan.close();

        //Determine the letter grade

        char grade;

        if (testScore < 60){
            grade = 'F';
        }else if (testScore < 70){
            grade = 'D';
        }else if(testScore < 80){
            grade = 'C';
        } else if (testScore < 90) {
            grade = 'B';
        }else {
            grade = 'A';
        }
        System.out.println("Your garde is = " +grade);
    }

}
