// Team: doubleN (Nicole Zhou, Duck, Nada Hameed, Ray)
// APCS
// HW41: Be Rational
// 2021-12-01
// time spent: 0.7 hr

/*
DISCO:
1) If you want the method to take in an object as a parameter, list the type as the class from where the object came from.
2) Overriding toString() helps us display attributes of the object.
QCC:
1) In what situations can we not use a dot operator to access private instance variables?
*/

public class Rational {
  private int numerator, denominator;

  public Rational(){
    numerator = 0;
    denominator = 1;
  }

  public Rational(int p, int q){
    if (q == 0){
      numerator = 0;
      denominator = 1;
      System.out.println("Impossible denominator");
    }
    else{
      numerator = p;
      denominator = q;
    }
  }

  public String toString(){
    return numerator + "/" + denominator;
  }

  public double floatValue(){
    double decimal = (double)numerator / denominator;
    return decimal;
  }

  public void multiply(Rational factor){
    numerator = numerator * factor.numerator;
    denominator = denominator * factor.denominator;
  }

  public void divide(Rational divisor){
    numerator = numerator * divisor.denominator;
    denominator = denominator * divisor.numerator;
  }

  public static void main(String[] args){
    Rational def = new Rational();
    System.out.println("Testing default constructor ( 0/1 ): " + def);

    Rational r0 = new Rational(1, 4);
    System.out.println("Testing overloaded constructor ( 1/4 ) : " + r0);

    System.out.println("\nWhen denominator is zero:");
    Rational impossible = new Rational(2, 0);
    System.out.println("Number becomes ( 0/1 ): " + impossible);

    System.out.println("\nTesting floatValue() ( 0.25 ): " + r0.floatValue());

    Rational r1 = new Rational(2, 3);

    r0.multiply(r1);
    System.out.println("\nTesting multiply():");
    System.out.println("r0 ( 2/12 ): " + r0);
    System.out.println("r1 ( 2/3 ): " + r1);

    r0.divide(r1);
    System.out.println("\nTesting divide():");
    System.out.println("r0 ( 6/24 ): " + r0);
    System.out.println("r1 ( 2/3 ): " + r1);
  }
}
