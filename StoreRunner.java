import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

  //Creates a basic acai bowl with default values
  //By using no argument
    Bowl bowl1 = new Bowl();
    System.out.println(bowl1);
    System.out.println("---------------");
  //Changes the fruit topping
  //From the basic acai bowl to mango
    bowl1.setFruitTopping1("mango");
    System.out.println("New Fruit Topping 1: " + bowl1.getFruitTopping1());
    System.out.println("-----------");
  //Creates a basic Sweet Treat acai bowl
  //Using default values with no arguments in the parameter
    SweetTreat stBowl = new SweetTreat();
    System.out.println(stBowl);
    System.out.println("---------------");
  //Changes the second sweetener of the bowl
  //To honey and prints the changes
    stBowl.setSweetener2("honey");
    System.out.println("New Sweetener 2: " + stBowl.getSweetener2());
    System.out.println("-----------");
  //Creates a basic Berry Crunch acai bowl
  //With no arguments by using default values
    BerryCrunch bcBowl = new BerryCrunch();
    System.out.println(bcBowl);
    System.out.println("---------------");
  //Changes the granola topping
  //And prints the changes
    bcBowl.setGranolaTopping("vanilla almond granola");
    System.out.println("New Granola Topping: " + bcBowl.getGranolaTopping());    
    System.out.println("-----------");
    
  }
}