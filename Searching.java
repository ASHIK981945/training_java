import java.util.Scanner;

// Searching here refers to finding an item in the array that meets some specified criterion. Sorting refers to rearranging all the items in the array into increasing or decreasing order (where the meaning of increasing and decreasing can depend on the context).

public class Searching {

    // unique -> not same element {1,2,3,4,5,}
    // duplicate -> same element {1,2,1,2,3,4,3,4}

    public void Search(int[] arr, int key) {
        int n = arr.length;
        boolean found = false;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (key == arr[i]) {
                found = true;
                index = i;
                break;
            }
        }
        if (found) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 6, 55, 54 };
        Scanner scan = new Scanner(System.in);
        System.out.println("enter you a key");
        int key = scan.nextInt();

        Searching myseSearching = new Searching();
        myseSearching.Search(arr, key);

        scan.close();

    }

}
