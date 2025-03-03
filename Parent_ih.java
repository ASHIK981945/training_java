class Parent {
    int a;
    int b;
    int result;
    int multi;

    // Constructor Parameters
    Parent(int a, int b) {
        this.a = a;
        this.b = b;
        this.result = a + b;

    }

    // Default Constructor
    Parent() {
        this.a = 5;
        this.b = 5;
        result = a + b;

    }
}

class child extends Parent {
    child() {
        // a = 0;
        // b = 0;
        // result = 0;
        super();
    }

    child(int a, int b) {
        super(a, b);

    }

}

public class Parent_ih {
    public static void main(String[] args) {
        child c1 = new child();
        System.out.println(c1.result);
        child c2 = new child(1, 4);
        System.out.println(c2.result);
    }
}