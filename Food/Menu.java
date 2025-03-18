import java.util.ArrayList;

class Menu {
    // Food -->food class ko object bahak aru use garna paidaina
    // ArrayList<Food> foodList= new ArrayList<>();
    // variable ko define data tpyes
    // array ->foodlist
    private ArrayList<Food> foodList;

    // default constructor
    Menu() {
        this.foodList = new ArrayList<>();
        // ArrayList<Food> foodList= new ArrayList<>();
    }

    // parameter constructor
    public Menu(ArrayList<Food> foodList) {
        this.foodList = foodList;
    }

    // not need return then we can use setter
    public void setFoodList(ArrayList<Food> foodList) {
        this.foodList = foodList;
    }

    // need return then we can use getter
    public ArrayList<Food> getFoodList() {
        return this.foodList;
    }

    // for one by one insertion of food in foodlist
    public void addFood(Food food) {
        this.foodList.add(food);
    }

    // remove from the arraylist
    public void removeFood(String name) {
        // data types variable : array
        for (Food food : foodList) {
            // variable.equals(varaible)
            if (food.getName().equals(name)) {
                // equals vayo vana remove huxa
                foodList.remove(food);
                // break ->stop then thow output
                break;
            }
        }
    }

    // display allfood name with price line by line
    public void getAllFood() {
        // data types variable : array
        for (Food v1 : foodList) {
            System.out.println("name" + v1.getName() + "price" + v1.getPrice());
            // System.out.println(food);
        }

    }

    public double getFoodPrice(String name) {
        // data types variable : array
        for (Food food : foodList) {
            // variable.equals(varaible)
            if (food.getName().equals(name)) {
                // show food price
                return food.getPrice();
            }
        }
        return 0;
    }

    // get input from user
    public void getFoodInput() {

    }

}
