// provide an example of  overriding and overloading

public class Olod_Owrit {

    // overloading
    int add(int a, int b) {
        return a + b;
    }

    // overridig
    public void move() {
        System.out.println("adding two number");
    }

    public static void main(String[] args) {
        Olod_Owrit a = new Olod_Owrit();
        int result = a.add(3, 5);
        System.out.println(result);
        Olod_Owrit b = new Olod_Owrit();
        b.move();

    }
}
