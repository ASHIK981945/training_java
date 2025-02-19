import java.util.Scanner;

public class Particles {

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
            System.out.println("found at index:" + index);
        } else {
            System.out.println("not found");
        }

    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 6, 7, 5, 4, };
        Scanner scan = new Scanner(System.in);
        System.out.println("enter you a key");
        int key = scan.nextInt();

        Particles mySearching = new Particles();
        mySearching.Search(arr, key);

        scan.close();
    }
}