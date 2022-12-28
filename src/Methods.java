import java.util.Scanner;

public class Methods {

    /**
     * Methods are used to break complex programs into small manageable peaces
     * Methods perform specific task and help to eliminate redundancy in our code
     */

    public static int addition (int n1, int n2){
        int sum = n1 + n2;
        return sum;
    }
    public static int subtraction (int n1, int n2){
        int sum = n1 - n2;
        return sum;
    }
    public static int multiplication (int n1, int n2){
        int sum = n1 * n2;
        return sum;
    }
    public static int division (int n1, int n2){
        int sum = n1 / n2;
        return sum;
    }
    public static String greetings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name here: ");
        String input = scanner.nextLine();
        return "Welcome to my program " + input;
    }

    public static void main(String[] args) {
        System.out.println(greetings());
        System.out.println(subtraction(10, 5));
        System.out.println(addition(10, 5));
    }
}
