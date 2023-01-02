package chap13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) throws Exception {

       // createNewFile();
       // numbersExceptionHandling();
        System.out.println(clacHours(41, 50));
        //createNewFileRethrow();

    }
    public static void createNewFileRethrow() throws Exception{
        File file = new File("recourses/nonexistent.txt");
        file.createNewFile();
    }
    public static void numbersExceptionHandling(){

        File file = new File("resources/numbers.txt");

        try(Scanner fileReader = new Scanner(file)){
            while (fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        }catch (FileNotFoundException | InputMismatchException e){
            System.out.println("Directory does not exist! ");
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }finally {
            System.out.println("Directory wasn't found! ");
        }

    }
    public static void createNewFile(){

        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        }catch (Exception e){
            System.out.println("Directory does not exist");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }


    }
    public static double clacHours(double h, double rate){
        // adding exception to the code manually
        if (h > 40){
            throw new IllegalArgumentException("Hours must be 40 or less");
        }
        return h * rate;
    }
}
