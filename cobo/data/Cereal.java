// Team: Non-Disclosure Agreement (Corina Chen, Jing Yi Feng, Nicole Zhou)
// APCS
// LAB08: America's Next Top Data Scientist
// 2022-04-05

public class Cereal{
  // instance variables
  private String _name, _type;
  private int _calories, _shelf;
  private double _protein, _fat, _sodium, _fiber, _carbohydrates, _sugar, _potassium, _vitamins, _weight, _cups, _rating;

  // constructor
  public Cereal(String Name, String Type, int Calories,
                double Protein, double Fat, double Sodium,
                double Fiber, double Carbohydrates, double Sugar,
                double Potassium, double Vitamins, int Shelf,
                double Weight, double Cups, double Rating)
  {
    _name = Name;
    _type = Type;
    _calories = Calories;
    _protein = Protein;
    _fat = Fat;
    _sodium = Sodium;
    _fiber = Fiber;
    _carbohydrates = Carbohydrates;
    _sugar = Sugar;
    _potassium = Potassium;
    _vitamins = Vitamins;
    _shelf = Shelf;
    _weight = Weight;
    _cups = Cups;
    _rating = Rating;
  }

  // -----------------------Accessor Methods-----------------------
  public String get(){
    return _name;
  }

  public String getType(){
    return _type;
  }

  public int getCalories(){
    return _calories;
  }

  public double getProtein(){
    return _protein;
  }

  public double getFat(){
    return _fat;
  }

  public double getSodium(){
    return _sodium;
  }

  public double getFiber(){
    return _fiber;
  }

  public double getCarbohydrates(){
    return _carbohydrates;
  }

  public double getSugar(){
    return _sugar;
  }

  public double getPotassium(){
    return _potassium;
  }

  public double getVitamins(){
    return _vitamins;
  }

  public int getShelf(){
    return _shelf;
  }

  public double getWeight(){
    return _weight;
  }

  public double getCups(){
    return _cups;
  }

  public double getRating(){
    return _rating;
  }
  //-----------------------Accessor Methods-----------------------


  // toString()
  public String toString(){
    String str = "";
    str += "----------" + _name + "----------\n";
    str += "Type: " + _type + "\n";
    str += "Calories: " + _calories + "\n";
    str += "Protein: " + _protein + "\n";
    str += "Fat: " + _fat + "\n";
    str += "Sodium: " + _sodium + "\n";
    str += "Fiber: " + _fiber + "\n";
    str += "Carbohydrates: " + _carbohydrates + "\n";
    str += "Sugar: " + _sugar + "\n";
    str += "Potassium: " + _potassium + "\n";
    str += "Vitamins: " + _vitamins + "\n";
    str += "Shelf: " + _shelf + "\n";
    str += "Weight: " + _weight + "\n";
    str += "Cups: " + _cups + "\n";
    str += "Rating: " + _rating;
    return str;
  }

  public static void main(String[] args){
    Cereal c0 = new Cereal("Cheerios", "C", 110, 6, 2, 290, 2, 17, 1, 105, 25, 1, 1, 1.25, 50.764999);
    System.out.println(c0);

    System.out.println();

    Cereal c1 = new Cereal("Corn Pops", "C", 110, 1, 0, 90, 1, 13, 12, 20, 25, 2, 1, 1, 35.782791);
    System.out.println(c1);
  }
}
