 public class BerryCrunch extends Bowl{
  
   private String fruitTopping2;        //Instance variable for the second fruit topping in the Berry Crunch acai bowl
   private String fruitTopping3;        //Instance variable for the third fruit topping in the Berry Crunch acai bowl
   private String granolaTopping;         //Instance variable for the granola topping in the Berry Crunch acai bowl

   //Constructor method
   //Sets default values for a Berry Crunch acai bowl
   public BerryCrunch(){
     this("Acai", "Almond Butter", "Strawberry", "Blueberry", "Mango", "Hemp Granola", 8.99);
   }

   //Constructor method
   //Uses instance variable from the super class
   //Adds on a second fruit topping, third fruit topping, and a granola topping
   public BerryCrunch(String baseFlavor, String sweetener1, String fruitTopping1, String fruitTopping2, String fruitTopping3, String granolaTopping, double price){
     super(baseFlavor, sweetener1, fruitTopping1, price);
     this.fruitTopping2 = fruitTopping2;
     this.fruitTopping3 = fruitTopping3;
     this.granolaTopping = granolaTopping;
   }

   //Accessor method
   //Returns the second fruit topping
   public String getFruitTopping2(){
     return fruitTopping2;
   }

  //Mutator method
  //Allows changes to be made for the second fruit topping
  public void setFruitTopping2(String newFruitTopping2){
   fruitTopping2 = newFruitTopping2;
  }

  //Accessor method
  //Returns the third fruit topping
  public String getFruitTopping3(){
     return fruitTopping3;
   }

  //Mutator method
  //Allows changes to be madefor the third fruit topping
  public void setFruitTopping3(String newFruitTopping3){
   fruitTopping3 = newFruitTopping3;
  }

   //Accessor method
   //Returns the granola topping of the Berry Crunch acai bowl
   public String getGranolaTopping(){
     return granolaTopping;
   }

   //Mutator Method
   //Allows changes to be made for the granola topping
   public void setGranolaTopping(String newGranolaTopping){
     granolaTopping = newGranolaTopping;
   }

   //Accessor method
   //Returns the information of the values for the Berry Crunch acai bowl
   public String toString(){
    return super.toString() + "\nSecond Fruit Topping: " + fruitTopping2 + "\nThird Fruit Topping: " + fruitTopping3 + "\nGranola Topping: " + granolaTopping ;
  }
 }