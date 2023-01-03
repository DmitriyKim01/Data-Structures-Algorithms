package Data_Structures;

import java.util.Stack;
public class Stacks {
    public static void main(String[] args) {
        testingBasicsFunctions();
    }

    public static void testingBasicsFunctions(){
        // Creating a stack:
        Stack<String> stack = new Stack<>();
        // Adding elements:
        stack.push("Zero");
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        // Deleting an element at the top:
        stack.pop();
        // Useful methods:
        String pop = stack.pop();
        System.out.println("Peeking the first element: " + stack.peek());
        System.out.println("Searching for the element: " + stack.search("First"));
        System.out.println("Printing our stack: " + stack);
    }
}
