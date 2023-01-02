package chap12;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    //  Map is not a true collection (does not inherit from Collection Interface)
    // Map - Unordered unique key-value pair    Map <String, Integer> myMap = new HashMap<>();
    public static void main(String[] args) {

        Map<String, Integer> transactions = new HashMap<>();

        transactions.put("phone", 1200);
        transactions.put("dress", 200);
        transactions.put("Car", 41200);
        transactions.put("food",75);

        transactions.putIfAbsent("Coffee", 5); // puts Coffee to the Map if Coffee doesn't exist
        System.out.println(transactions.containsKey("phone"));
        System.out.println(transactions.keySet()); // return only keys
        System.out.println(transactions.values()); // return only values
        System.out.println(transactions.entrySet()); // return key = values
        System.out.println(transactions.get("Car"));

        for (Map.Entry i: transactions.entrySet()){
            System.out.println(i);
        }
        System.out.println("=========================");
        for (var entry: transactions.entrySet()){
            System.out.println(entry.getKey() + ": " +entry.getValue());
        }
        System.out.println("=========================");
        transactions.forEach((k,v) -> System.out.println("Item: "+k +", Value: " + v));

    }

}
