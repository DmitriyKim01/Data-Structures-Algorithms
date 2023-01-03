package Algorithms;

import java.util.HashSet;
import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        int[] testingArray = createArray();
        System.out.println("Bubble sort: ");
        bubbleSort(testingArray);
        for (int i : testingArray){
            System.out.print(i + " ");
        }

        System.out.println();

        testingArray = createArray();
        System.out.println("Selection sort: ");
        selectionSort(testingArray);
        for (int i : testingArray){
            System.out.print(i + " ");
        }

        System.out.println();

        testingArray = createArray();
        quickSort(testingArray, 0, testingArray.length-1);
        System.out.println("Quick sort: ");
        for (int i : testingArray){
            System.out.print(i + " ");
        }

        System.out.println();

        testingArray = createArray();
        mergeSort(testingArray);
        System.out.println("Merge sort: ");
        for (int i : testingArray){
            System.out.print(i + " ");
        }
    }

    public static int[] createArray(){
        Random random = new Random();
        HashSet<Integer> set = new HashSet<>();
        int[] array = new int[random.nextInt(30)];
        for (int i = 0; i < array.length; i++){
            int temp = random.nextInt(100);
            while (!set.add(temp)) temp = random.nextInt(100);
            array[i] = temp;
        }
        return array;
    }

    //Time complexity O(n^2)
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i ++){
            for (int j = 0; j < array.length - 1 - i; j++){
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[i] = temp;
                }
            }
        }
    }

    //Time complexity O(n^2)
    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length-1; i++){
            int min = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[min] > array[j]) min = j;
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    // Time complexity O(nlogn)
    public static void quickSort(int[] array, int start, int end){
        if (end <= start) return;  //Base Case
        int pivot = pivotFinder(array, start, end);
        quickSort(array, start, pivot-1);
        quickSort(array, pivot+1, end);
    }

    public static int pivotFinder(int[] array, int start, int end){
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

    // Time complexity O(nlogn)
    public static void mergeSort(int[] array){
        int length = array.length;
        if (length <= 1) return;// Base case;

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];
        int i = 0; // Left Array;
        int j = 0; // Right Array;

        for (; i < length; i++){
            if (i < middle) leftArray[i] = array[i];
            else{
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        mergeArrays(leftArray, rightArray, array);
    }
    private static void mergeArrays(int[] leftArray, int[] rightArray, int[] array){
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0;    // Indices;
        // Check the condition for merging:
        while (l < leftSize && r < rightSize){
            if (leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }else{
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while(l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
