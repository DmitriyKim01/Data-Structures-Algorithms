package Structures;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        tutorial();

        Node nodeA = new Node(6);
        Node nodeB = new Node(3);
        Node nodeC = new Node(4);

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
        System.out.println("We can implement the list as a stack (push, pop): " + listStack);

        //Queue implementation:
        listQueue.offer("Zero");
        listQueue.offer("First");
        listQueue.offer("Second");
        listQueue.offer("Third");
        listQueue.poll();
        System.out.println("Or, we can implement it as a queue (offer, poll):" + listQueue);

        //Adding nodes:
        list.add(0, "Zero");
        list.add(1, "First");
        list.add(2, "Second");
        list.add(3, "Third");
        list.remove();
        System.out.println("Finally we can use (add and remove) methods: : " + list);

        //Useful methods:
        System.out.println("With lists, we can search for index: " + list.indexOf("Zero"));
        System.out.println("We can also peek elements like in stacks or queues: " + list.peekFirst());
        System.out.println("Or peek the last element: " + list.peekLast());
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
