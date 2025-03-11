class Parent {
    int a;
    int b;
    int result;

    // Constructor Parameters
    Parent(int a, int b) {
        this.a = a;
        this.b = b;
        result = a + b;

    }

    // Default Constructor
    Parent() {
        // this.a = 5;
        // this.b = 5;
        // result = a + b;

    }
}

class child extends Parent {

    child() {

        super();
    }

    child(int a, int b) {
        super(a, b);

    }

}

public class Parent_ih {
    public static void main(String[] args) {
        // call oject
        child c1 = new child();
        System.out.println(c1.result);
        child c2 = new child(1, 4);
        System.out.println(c2.result);
    }
}