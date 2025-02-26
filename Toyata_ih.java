class car {
    void startengine() {
        System.out.println(" l am start");
    }

    void classengine() {
        System.out.println("i am end");
    }
}

class Bmw extends car {
    void startclassengine() {
        super.startengine();
        super.classengine();
    }

}

// extends -->The extends keyword in Java is used to indicate that a class is
// inheriting from a superclass.
public class Toyata_ih extends Bmw {
    public static void main(String[] args) {
        Bmw b = new Bmw();
        b.startclassengine();

        Toyata_ih t = new Toyata_ih();
        t.startengine();
        t.classengine();

    }

}
