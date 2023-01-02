package chap12;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class SetPractice {
   // Set - Unordered unique elements   Set<Integer> mySet = new HashSet();

    public static void main(String[] args) {
        Set <String>fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Cherry");

        var i = fruits.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("==============================");
        for (String items : fruits){
            System.out.println(items);
        }
        System.out.println("==============================");
        fruits.forEach(x -> System.out.println(x));
        System.out.println("==============================");
        fruits.forEach(System.out::println);
    }

}
