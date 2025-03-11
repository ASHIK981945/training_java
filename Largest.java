// find large integer among odd of an arry

public class Largest {

    public int getlargest(int[] arr) {
        int n = arr.length;
        int larg = 0;

        for (int i = 0; i < n; i++) {
            if (larg < arr[i] && arr[i] % 2 != 0) {
                larg = arr[i];

            }
        }
        return larg;
    }

    public static void main(String[] args) {
        Largest o = new Largest();
        int[] array = { 1, 2, 3, 4, 5, 6 };
        int lar = o.getlargest(array);
        System.out.println(lar);
    }
}
