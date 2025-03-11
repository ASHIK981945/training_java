
public class Overriding {

    void method1() {
        System.out.println("firstparent");
    }

    void method2() {
        System.out.println("secondparent");
    }

    void method3() {
        System.out.println("thirdparent");
    }

    class chid extends Overriding {
        void method1() {
            System.out.println("firstchild");
        }

        void method2() {
            System.out.println("secondchild");
        }
    }

    public static void main(String[] args) {
        Overriding b = new Overriding();
        b.method1();
        Overriding.chid a = b.new chid();
        a.method1();

    }
}
