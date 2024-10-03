public class Bowl {
 
  private String baseFlavor;       //Instance Variable: contains information about the base flavor of acai bowl
  private String sweetener1;       //Instance Variable: information about the first sweetener
  private String fruitTopping1;    //Instance Variable: information about the first fruit topping
  private double price;            //Instance Variable: the price of the bowl

  //Constructor method
  //Sets default values for the
  //Base flavor, first sweetener, first fruit topping, and price
  //In an acai bowl
  public Bowl(){
    this("Acai puree", "honey", "strawberry", 5.9);
  }

  //Constructor
  //Uses four parameters: Base flavor, Sweetener, First Fruit Topping , and Price
  public Bowl(String baseFlavor, String sweetener1, String fruitTopping1, double price){
    this.baseFlavor = baseFlavor;
    this.sweetener1 = sweetener1;
    this.fruitTopping1 = fruitTopping1;
    this.price = price;
  }
  //Accessor method
  //Returns the base flavor of the acai bowl
  public String getBaseFlavor(){
    return baseFlavor;
  }

  //Mutator method
  //Allows changes to be made for the base flavor
  public void setBaseFlavor(String newBaseFlavor){
   baseFlavor = newBaseFlavor;
  }

  //Accessor method
  //Returns the first sweetener of the acai bowl
   public String getSweetener1(){
    return sweetener1;
  }

  //Mutator method
  //Allows changes to be made for the first sweetener
  public void setSweetener1(String newSweetener1){
    sweetener1 = newSweetener1;
  }

  //Accessor method
  //Returns the first fruit topping of the acai bowl
   public String getFruitTopping1(){
    return fruitTopping1;
  }

  //Mutator method
  //Allows changes to be made for the first fruit topping
  public void setFruitTopping1(String newFruitTopping1){
    fruitTopping1 = newFruitTopping1;
  }

  //Accessor method
  //Returns the price of the acai bowl
   public double getPrice(){
    return price;
  }

  //Mutator method
  //Allows changes to be made for the price of the acai bowl
  public void setPrice(double newPrice){
    price = newPrice;
  }

  //Accessor method
  //Provides information about the values for an acai bowl
  public String toString(){
    return "Base Flavor: " + baseFlavor + "\nFirst Sweetener: " + sweetener1 + "\nFirst Fruit Topping: " + fruitTopping1 + "\nPrice: " + price;
  }

}