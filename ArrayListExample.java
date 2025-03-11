import java.util.ArrayList;

class Example {
    void display() {
        System.out.println("hey i am from exmple class");
    }
}

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Example ex = new Example();
        list.add("apple");
        list.add("banana");
        list.add(1);
        list.add(ex);

        boolean iscontain = list.contains("orange");
        System.out.println("does orange exists in list:" + iscontain);

        System.out.println(list);

        // remove
        list.remove(ex);
        System.out.println(list);

        // we can make an arraylist of any data types we list we like eg: i want my
        // arrayelements to be of string data only
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("Brown");
        System.out.println(stringList);
    }
}
