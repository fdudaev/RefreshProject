package chap12;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
 //   Queue - Ordered element for processing. Access in the order element were added. (FIFO - fist in first out)

    public static void main(String[] args) {

        Queue phones = new LinkedList<>();

        phones.add("Motorola");
        phones.add("Motorola");
        phones.add("iPhone");
        phones.add("Android");
        phones.add("Nokia");

        var i = phones.iterator();
        int order = 0;
        while (i.hasNext()){
            order++;
            System.out.println(order+": "+i.next());
        }
        phones.remove(); // will remove first element from the phone
        phones.remove(); // will remove second element from the phone

        System.out.println(phones);
        System.out.println(phones.peek()); // will return the header of the queue (element with new index 1)


    }
}
