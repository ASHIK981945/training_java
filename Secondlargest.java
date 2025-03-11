public class Secondlargest {
    public int getlargest(int[] arr) {
        int n = arr.length;
        int larg = 0;

        for (int i = 0; i < n - 1; i++) {
            if (larg < arr[i]) {
                larg = arr[i];
            }
        }
        return larg;
    }

    public static void main(String[] args) {
        Largest o = new Largest();
        int[] array = { 45, 55, 12, 24, 52, 90 };
        int lar = o.getlargest(array);
        System.out.println("The Second Largest Element In The Array:" + lar);
    }
}
