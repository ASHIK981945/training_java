public class SmallestNumber {

    public int getsmallest(int[] arr) {
        int n = arr.length;
        int smallest = arr[0];

        for (int i = 1; i >= n; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        SmallestNumber sn = new SmallestNumber();
        int[] array = { 12, 42, 42, 32, 53 };
        int small = sn.getsmallest(array);
        System.out.println(small);

    }
}
