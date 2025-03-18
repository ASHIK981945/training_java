import java.util.Scanner;

public class Foodlists {
    // main fuction
    public static void main(String[] args) {

        // // object
        Menu newM = new Menu();
        // n.addFood(new Food("momo", 160));
        // n.addFood(new Food("mama", 5));
        // n.addFood(new Food("chaumin", 45));
        // n.addFood(new Food("pizza", 450));
        // n.getAllFood();

        // adding food and price in aaraylist by asking with users
        Scanner n = new Scanner(System.in);
        System.out.println("how many foods item you want to add:");
        int foodsize = n.nextInt();
        n.nextLine();
        String name;
        int price;
        for (int i = 0; i < foodsize; i++) {
            System.out.println("enter you name food");
            name = n.nextLine();
            System.out.println();
            System.out.println("enter you price food");
            price = n.nextInt();
            n.nextLine();
            newM.addFood(new Food(name, price));
        }
        n.close();
        newM.getAllFood();
    }
}