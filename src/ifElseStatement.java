import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ifElseStatement {
/**
 * IF ELSE
 * All salespeople are expected to make at least 10 sales each week
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short.
 */
    public static void main (String [] args){

        //Initialize values we know
        int minSales = 10;
        //Get unknown values
        Scanner scan = new Scanner(System.in);
        System.out.println("Number of sales for this week: ");
        int numberOfSales = scan.nextInt();

        scan.close();
        //Make a decision on the patch to take - Output
        if (numberOfSales < minSales){
            int salesForThisWeek = minSales - numberOfSales;
            System.out.println("You are " + salesForThisWeek + " sales short for reaching weekly goal this week");
        }else{
            System.out.println("Congratulations, you have exceeded expectations!!!");
        }

    }

}
