public class Bubblesort {
    public static void main(String[] args) {
        int arr[] = { 3, 7, 2, 1, 9, 4, 5 };
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(".........");

        System.out.println("After Sorting");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " ");
        }
    }

}