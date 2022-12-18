package Sorting_Algorithms;

import java.util.HashSet;
import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        int[] bubbleTest = bubbleSort(unitTest());
        System.out.println("Bubble sort: ");
        for (int i : bubbleTest) System.out.print(i + " ");

        System.out.println();

        int[] selectionTest = selectionSort(unitTest());
        System.out.println("Selection sort: ");
        for (int i : selectionTest) System.out.print(i + " ");

        System.out.println();


    }

    public static int[] unitTest(){
        Random random = new Random();
        HashSet<Integer> set = new HashSet<>();
        int[] array = new int[random.nextInt(10)];
        for (int i = 0; i < array.length; i++){
            int temp = random.nextInt(100);
            while (!set.add(temp)) temp = random.nextInt(100);
            array[i] = temp;
        }
        return array;
    }

    //Time complexity O(n^2)
    public static int[] bubbleSort(int[] array){
        int temp = 0;
        for (int i = 0; i < array.length - 1; i ++){
            for (int j = 0; j < array.length - 1 - i; j++){
                if (array[j] > array[j + 1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    //Time complexity O(n^2)
    public static int[] selectionSort(int[] array){
        for (int i = 0; i < array.length-1; i++){
            int min = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[min] > array[j]) min = j;
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }
}
