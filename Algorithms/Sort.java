package Algorithms;

import java.util.HashSet;
import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        int[] testArray = unitTest();
        int[] bubbleTest = bubbleSort(testArray);
        System.out.println("Bubble sort: ");
        for (int i : bubbleTest) System.out.print(i + " ");

        System.out.println();
        int[] selectionTest = selectionSort(testArray);
        System.out.println("Selection sort: ");
        for (int i : selectionTest) System.out.print(i + " ");

        System.out.println();
        quickSort(testArray, 0, testArray.length-1);
        System.out.println("Quick sort: ");
        for (int i : testArray) System.out.print(i + " ");
        
    }

    public static int[] unitTest(){
        Random random = new Random();
        HashSet<Integer> set = new HashSet<>();
        int[] array = new int[random.nextInt(15)];
        for (int i = 0; i < array.length; i++){
            int temp = random.nextInt(100);
            while (!set.add(temp)) temp = random.nextInt(100);
            array[i] = temp;
        }
        return array;
    }

    //Time complexity O(n^2)
    public static int[] bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i ++){
            for (int j = 0; j < array.length - 1 - i; j++){
                if (array[j] > array[j + 1]){
                    array[j] += array[j+1];
                    array[j+1] = array[j] - array[j+1];
                    array[j] -= array[j+1];
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

    // Time complexity O(nlogn)
    public static void quickSort(int[] array, int start, int end){
        if (end <= start) return;  //Base Case
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot-1);
        quickSort(array, pivot+1, end);
    }

    public static int partition(int[] array, int start, int end){
        int pivot = array[end];
        int i = start-1;
        int temp = 0;
        for (int j = start; j <= end-1; j++){
            if (array[j] < pivot){
                i++;
                // Swapping algorithm:
                temp = array[i];
                array[i] = array[j];
                array[j] = array[i];
            }
        }
        i++;
        // Swapping algorithm:
        temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;
    }


}
