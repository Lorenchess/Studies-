package BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] { 1,2,3,4,5,6,7 };
        System.out.println(isNumberPresent(arr, 9));
    }

    public static boolean isNumberPresent(int[] arr, int target) {
        return findTarget(arr, target) >= 0;
    }

    public static int findTarget(int[] arr, int target) {
        int pivot;
        int left = 0;
        int right = arr.length -1;

        while (left <= right) {
        pivot = left + (right - left) / 2;
            if (arr[pivot] == target) return pivot;
            if (target < arr[pivot]) right = pivot - 1;
            else left = pivot + 1;
        }
        return -1;
    }


}
