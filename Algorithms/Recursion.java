package Algorithms;

public class Recursion {
    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(isPalindrome("HefeH", 0));
        long end = System.nanoTime();
        // Using NanoTime to check the algorithm actual speed:
        System.out.println(end-start);
    }

    // Is Palindrome method using loops:
    public static boolean isPalindrome(String word){
        for (int i = 0; i < word.length() / 2; i++){
            if (word.charAt(i) != word.charAt(word.length()-1-i)) return false;
        }
        return true;
    }
    // Is Palindrome method using recursion:
    public static boolean isPalindrome(String word, int i){
        if (word.charAt(i) != word.charAt(word.length()-1-i)) return false;
        if (i == (word.length() - 1)/2) return true;
        return isPalindrome(word, ++i);
    }
}
