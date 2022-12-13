import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        tutorial();
    }

    public static void tutorial(){
        // Creating a queue:
        Queue<String> queue = new LinkedList<String>();
        // Adding elements:
        queue.offer("Karen");
        queue.offer("Steve");
        queue.offer("Chad");
        queue.offer("Harold");
        // Deleting Elements:
        queue.poll();
        // Methods:
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Karen"));
    }
}
