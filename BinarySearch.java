public class BinarySearch {
    public static void main(String[] args) {

    }

    public static int binarySearch(int[] list, int target){
        int min = 0;
        int max = list.length-1;
        while (min <= max){
            int middle = min + (max-min)/2;
            if (list[middle] < target) min = middle + 1;
            else if (list[middle] > target) max = middle - 1;
            else return middle;
        }
        return -1;
    }
}
