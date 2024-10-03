public class SweetTreat extends Bowl{
  
  private String sweetTopping;        //Instance variable for a sweet topping in a Sweet Treat acai bowl
  private String sweetener2;          //Instance variable for the second sweetener in a Sweet Treat acai bowl

  //Constructor method
  //Sets default values for the
  //Base flavor, first sweetener, first fruit topping, sweet topping, second sweetener, and price
  //In a Sweet Treat acai bowl
  public SweetTreat(){
    this("Acai", "Honey", "Banana","oreos", "nutella", 7.99);
  }

  //Constructor method
  //Uses instance variables from the superclass Bowl
  //while adding the sweet topping and second sweetenr with parameters
  public SweetTreat(String baseFlavor, String sweetener1, String fruitTopping1, String sweetTopping, String sweetener2, double price){
    super(baseFlavor, sweetener1, fruitTopping1, price);
    this.sweetTopping = sweetTopping;
    this.sweetener2 = sweetener2;
  }

  //Accessor method
  //Returns the value of the sweet topping in the Sweet Treat bowl
  public String getSweetTopping(){
    return sweetTopping;
  }

  //Mutator method
  //Allows changes to be made for the sweet topping
  public void setSweetTopping(String newSweetTopping){
   sweetTopping = newSweetTopping;
  }

  //Accessor method
  //Returns the value for the second sweetener in the Sweet Treat bowl
  public String getSweetener2(){
    return sweetener2;
  }

  //Mutator method
  //Allows changes to be made for the second sweetener in the Sweet Treat bowl
  public void setSweetener2(String newSweetener2){
   sweetener2 = newSweetener2;
  }

  //Accessor method
  //Returns the information of the values for the Sweet Treat acai bowl
  public String toString(){
    return super.toString() + "\nSweet Topping: " + sweetTopping + "\nSweetener 2: " + sweetener2;
  }
}