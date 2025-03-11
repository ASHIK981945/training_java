import java.util.ArrayList;

class Food {
    private String name;
    private double price;

    Food() {

    }

    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\n{Name: " + name + " Price: " + price + "}";
    }
}

class Menu {
    String category;
    ArrayList<Food> menuItems;

    Menu() {
        menuItems = new ArrayList<>();
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setMenuItems(ArrayList<Food> foods) {
        this.menuItems = foods;
    }

    public String getCatagory() {
        return category;
    }

    public ArrayList<Food> menuItems() {
        return menuItems;
    }

    public void additems(Food food) {
        this.menuItems.add(food);
    }

    public void removeItems(String name) {
        for (Food f : menuItems) {
            if (f.getName() == (name)) {
                menuItems.remove(f);
                break;
            }
        }
    }

    public void display() {
        System.out.println(menuItems);
    }
}

public class C4_ArrayListExample_FoodMenuOrder {

    public static void main(String[] args) {

        ArrayList<Food> list = new ArrayList<>(5);

        list.add(new Food("Momo", 180));
        list.add(new Food("Chowmin", 150));
        list.add(new Food("Samosa", 100));
        list.add(new Food("Doughnut", 80));
        list.add(new Food("Rice", 150));

        // double total = 0;
        // for (Food food : list) {
        // System.out.println(food);
        // total = total + food.getPrice();
        // }
        // System.out.println("Total Price: "+ total);

        Menu men = new Menu();
        men.menuItems = list;
        men.removeItems("Rice");
        men.display();

    }

}