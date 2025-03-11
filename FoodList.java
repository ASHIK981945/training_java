import java.util.*;

// sabaii class ko parent class obje class huxa {hashcode,equal,tostring}
class Food {
    private String name;
    private Double price;
    // private String category;

    // constructor
    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // set
    void setName(String name) {
        this.name = name;
    }

    void setPrice(Double price) {
        this.price = price;
    }

    // get
    String getname() {
        return name;
    }

    double getprice() {
        return price;
    }

    // parent ma vako method override garako
    public String toString() {
        return "\n{name:" + name + "price:" + price + "}";
    }
}

class Menu {
    String category;
    ArrayList<Food> menuItems;

    Menu() {
        menuItems = new ArrayList<>();
    }

    public void setcategory(String category) {
        this.category = category;
    }

    public void setMenuItems(ArrayList<Food> foods) {
        this.menuItems = foods;

    }

    public String getcategory() {
        return category;

    }

    public ArrayList<Food> getMenuItems() {
        return menuItems;
    }

    public void addItems(Food food) {
        menuItems.add(food);
    }
    // public void removeItem(string ){

    // }
}

public class FoodList {
    public static void main(String[] args) {

        // set
        // Food f1 = new Food();
        // f1.setName("momo");
        // f1.setPrice(12.98);

        // Food f2 = new Food();
        // f2.setName("samoso");
        // f2.setPrice(102.3);

        // // object
        // // cannot put int ,
        // // array is fix size
        // ArrayList<Food> menu = new ArrayList<Food>();
        // menu.add(f1);
        // menu.add(f2);

        //
        ArrayList<Food> list = new ArrayList<Food>();
        // list --> object .add(new Food --> class name ("chowin", 2.2));

        // list.add(new Food("momo", 12.2));
        // list.add(new Food("chowin1", 2.2));
        // list.add(new Food("chowin2", 22.2));
        // list.add(new Food("chowin3", 27.2));
        // list.add(new Food("chowin4", 452.2));
        // list.add(new Food("chowin12", 234.2));

        // // camnot use tostring output come in hashcode
        // // System.out.println(list);

        // // for each
        // for (Food food : list) {
        // System.out.println(food);
        // }

        Menu menu1 = new Menu();
        menu1.setcategory("momo");
        menu1.addItems(new Food("chickmomo", 230));
        menu1.addItems(new Food("foodmomo", 670));
        menu1.addItems(new Food("watermomo", 130));
        System.out.println(menu1.getMenuItems());
    }
}