package Algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Search {
    static Random random = new Random();
    public static void main(String[] args) {
        int[] binaryTest = unitTest();
        int target = random.nextInt(10)+1;
        System.out.println(target + " is on position: " + binarySearch(binaryTest, target));
        for (int i : binaryTest) System.out.print(i + " ");
    }
    public static int[] unitTest(){
        HashSet<Integer> set = new HashSet<>();
        int[] array = new int[random.nextInt(11)];
        for (int i = 0; i < array.length; i++){
            int temp = 1;
            while (!set.add(temp)) temp = random.nextInt(10)+1;
            array[i] = temp;
        }
        return array;
    }

    //Time complexity is O(logn)
    public static int binarySearch(int[] array, int target) {
        Arrays.sort(array);
        int min = 0;
        int max = array.length-1;
        while (min <= max){
            int middle = min + (max - min) / 2;
            if (array[middle] < target) min = middle + 1;
            else if (array[middle] > target) max = middle - 1;
            else return middle;
        }
        return -1;
    }
}
