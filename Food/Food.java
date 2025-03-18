
//  sabaii class ko parent class obje class huxa {hashcode,equal,tostring}
class Food {
     private String name;
     private int price;

     // default construction
     public Food() {

     }

     // parameter constructor
     public Food(String name, int price) {
          this.name = name;
          this.price = price;
     }

     // setter
     public void setName(String name) {
          this.name = name;
     }

     // getter
     public String getName() {
          return this.name;
     }

     // setter
     public void setPrice(int price) {
          this.price = price;
     }

     // getter
     public int getPrice() {
          return this.price;
     }

}
