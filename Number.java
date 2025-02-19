public class Number {
    // int[] array1;

    // { 1,4,6,3,5,8} // void is local varialbe
    // methods
    public int getlargest(int[] arr) {
        int n = arr.length; // length -> size
        int large = arr[0]; // {arrys is started 0}

        for (int i = 1; i <= n - 1; i++) {
            if (large < arr[i]) {

                large = arr[i];
            }
        }
        return large;
    }

    public static void main(String[] args) {
        Number number = new Number();
        int[] array = { 1, 5, 7, 9, 3, 5 };
        int largest = number.getlargest(array);
        System.out.println(largest);
    }
}