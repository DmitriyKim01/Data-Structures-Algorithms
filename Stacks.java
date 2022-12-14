import java.util.Stack;
public class Stacks {
    public static void main(String[] args) {
        tutorial();
    }

    public static void tutorial(){
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
        System.out.println(stack.peek());
        System.out.println(stack.search("Zero"));
        System.out.println(stack);

    }
}
