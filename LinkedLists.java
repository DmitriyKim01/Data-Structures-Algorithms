import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        tutorial();

        Node nodeA = new Node(6);
        Node nodeB = new Node(3);
        Node nodeC = new Node(4);
        Node nodeD = new Node(2);
        Node nodeE = new Node(1);

    }

    public static void tutorial(){
        LinkedList<String> listStack = new LinkedList<>();
        LinkedList<String> listQueue = new LinkedList<>();
        LinkedList<String> list = new LinkedList<>();

        //Stack implementation:
        listStack.push("Zero");
        listStack.push("First");
        listStack.push("Second");
        listStack.push("Third");
        listStack.pop();
        System.out.println(listStack);

        //Queue implementation:
        listQueue.offer("Zero");
        listQueue.offer("First");
        listQueue.offer("Second");
        listQueue.offer("Third");
        listQueue.poll();
        System.out.println(listQueue);

        //Adding nodes:
        list.add(0, "Zero");
        list.add(1, "First");
        list.add(2, "Second");
        list.add(3, "Third");
        list.remove();
        System.out.println(list);

        //Useful methods:
        System.out.println(list.indexOf("Zero"));
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        list.addFirst("Minus");
        list.addLast("Fourth");
        list.removeFirst();
        list.removeLast();
    }
}

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
    }

    int countNodes(Node head){
        int count = 1;
        while (head != null){
            head = head.next;
            count++;
        }
        return count;
    }
}
