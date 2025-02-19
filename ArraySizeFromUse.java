import java.util.Scanner;

class SmallestNumber {

    int getSmalllest(int[] arr) {
        int n = arr.length;
        int smallest = arr[0];

        for (int i = 1; i < n; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }

        }
        return smallest;

    }
}

public class ArraySizeFromUse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        SmallestNumber s = new SmallestNumber();
        int smallest = s.getSmalllest(arr);
        System.out.println(smallest);
        input.close();

    }
}