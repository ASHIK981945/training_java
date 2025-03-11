//provide an example of inheritance (include use of super keyword also include any two parament construct)

class Add {
    int a;
    int b;
    int result;

    Add(int a, int b) {
        this.a = a;
        this.b = b;
        result = a + b;
    }

    Add() {

    }
}

class Childer extends Add {

    Childer() {

        super();
    }

    Childer(int a, int b) {
        super(a, b);

    }

}

public class Test {
    public static void main(String[] args) {
        Childer a = new Childer();
        System.out.println(a.result);
        Childer a2 = new Childer(1, 2);
        System.out.println(a2.result);

    }
}
