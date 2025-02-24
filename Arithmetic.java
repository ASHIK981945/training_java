class Number {
    int addtwoDigit(int a, int b) {
        return a + b;
    }
}

class Addition extends Number {

}

public class Arithmetic {
    public static void main(String[] args) {
        Addition a = new Addition();
        int res = a.addtwoDigit(2, 5);
        System.out.println(res);
    }
}
