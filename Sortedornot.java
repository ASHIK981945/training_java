public class Sortedornot {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        boolean isSorted = true; // Assume the array is sorted

        for (int i = 0; i < n - 1; i++) { // Loop till second last element
            if (arr[i] > arr[i + 1]) { // If any element is greater than the next, it's not sorted
                isSorted = false;
                break; // No need to check further
            }
        }

        if (isSorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}
