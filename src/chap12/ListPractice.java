package chap12;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

//    List - Ordered elements which can be accessed by their position
//    ArrayList <String> myList = new ArrayList<>();

    public static void main(String[] args) {

        List<String> cars = new ArrayList<>();

        cars.add("Audi");
        cars.add("Volvo");
        cars.add("Nissan");
        cars.add("BMW");

        System.out.println("The size of list is: "+cars.size());
        System.out.println("The car you are looking for is: "+cars.get(0));
        cars.add(2, "Audi");
        System.out.println(cars.subList(0,2)); // return a list by giving start and end index
        List<String> myCars = cars.subList(0,3);
        System.out.println(myCars);
        System.out.println(cars.indexOf("Audi"));
        System.out.println(cars.lastIndexOf("Audi"));

        int counter = 0;
        for (String i : cars){
            counter ++;
            System.out.println("Car " +counter+": "+i);
        }
        var c = 0;
        var i = cars.iterator();
        while (i.hasNext()){
            c++;
            System.out.println("Brand " +c+": "+i.next());
        }



    }

}
