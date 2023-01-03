package Data_Structures;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        testingBasicsFunctions();
    }

    public static void testingBasicsFunctions(){
        // Creating a queue:
        Queue<String> queue = new LinkedList<String>();
        // Adding elements:
        queue.offer("Zero");
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");
        // Deleting Elements:
        queue.poll();
        // Methods:
        System.out.println("Peeking the first element: " + queue.peek());
        System.out.println("Is Empty?: " + queue.isEmpty());
        System.out.println("We can check for the size of a queue: " + queue.size());
        System.out.println("Or if it contains the specific element: " + queue.contains("Zero"));
    }
}
