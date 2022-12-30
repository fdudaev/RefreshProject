import java.util.Scanner;

/*
Create a program that allows a user to enter any number of grades
and provides them with their average score, as well as the highest and lowest score
 */
public class Grades {

    private static int grades[] ;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("How many grades would you like to enter?: ");
        grades = new int[scanner.nextInt()];

        getGrades();
        System.out.println("Average : " + String.format("%.2f", calculateAverage()));
        System.out.println("Highest: " + getHighest());
        System.out.println("Lowest: "+ getLowest());


    }
    private static void getGrades(){
        for (int i = 0; i < grades.length; i ++){
            System.out.println("Enter a grade #"+ (i+1));
            grades[i] = scanner.nextInt();
        }
    }
    private static int calculateSum(){

        int sum = 0;
        for (int i : grades){
            sum = sum + i;
        }
        return sum;
    }
    public static double calculateAverage(){
        return calculateSum() / grades.length;
    }
    public static int getHighest(){
        int highest = grades[0];
        for ( int i : grades){
            if(i > highest){
                highest = i;
            }
        }
        return highest;
    }
    public static int getLowest(){
        int lowest = grades[0];
        for (int i : grades){
            if (i < lowest){
                lowest = i;
            }
        }
        return lowest;
    }

}
