// Team: doubleN (Nicole Zhou, Duck, Nada Hameed, Ray)
// APCS
// HW42: Be More Rational
// 2021-12-05
// time spent: 0.7 hr

/*
DISCO:
1) Inside a method with no parameters, you can call another method with no parameters by just typing the method name inside it (no dot operator).
2) You can have multiple methods with the same name as long as they are a bit different from each other (e.g. the number of parameters the methods could take in).
QCC:
1) Why do we have static and non-static methods? What are the benefits?
2) Is there a name for methods with no parameters?
*/

public class Rational {
  private int numerator, denominator;

  public Rational(){
    numerator = 0;
    denominator = 1;
  }

  public Rational(int p, int q){
    this();
    if (q != 0){
      numerator = p;
      denominator = q;
    }
    else{
      System.out.println("Invalid number. Denominatior set to 1.");
    }
  }

  public String toString(){
    return numerator + "/" + denominator;
  }

  public double floatValue(){
    return (double)numerator / denominator;
  }

  public void multiply(Rational r){
    numerator = numerator * r.numerator;
    denominator = denominator * r.denominator;
  }

  public void divide(Rational r){
    numerator = numerator * r.denominator;
    denominator = denominator * r.numerator;
  }

  // from HW26
  public static int gcd(int a, int b){
    int x = 1;
    int gcd = 1;
    while ((x <= a) && (x <= b)){
      if ((a % x == 0) && (b % x == 0)){
        gcd = x;
      }
      x += 1;
    }
    return gcd;
  }

  public void add(Rational r){
    int p = numerator * r.denominator;
    int pr = denominator * r.numerator;
    numerator = p + pr;
    denominator = denominator * r.denominator;
  }

  public void subtract(Rational r){
    int p = numerator * r.denominator;
    int pr = denominator * r.numerator;
    numerator = p - pr;
    denominator = denominator * r.denominator;
  }

  public int gcd(){
    return gcd(numerator, denominator);
  }

  public void reduce(){
    int gcd = gcd();
    numerator = numerator / gcd;
    denominator = denominator / gcd;
  }

  // However, it changes the calling object
  public int compareTo(Rational r){
    subtract(r);
    return numerator;
  }

  public static void main(String[] args){
    Rational a = new Rational(2, 3);
    Rational b = new Rational(1, 2);
    Rational c = new Rational(4, 18);

    System.out.println("Testing add():");
    a.add(b);
    System.out.println("a: " + a); // 7/6
    System.out.println("b: " + b); // 1/2

    System.out.println("\nTesting subtract():");
    a.subtract(b);
    System.out.println("a: " + a); // 2/3
    System.out.println("b: " + b); // 1/2

    System.out.println("\nTesting reduce():");
    c.reduce();
    System.out.println("c: " + c); // 2/9

    System.out.println("\nTesting compareTo():");
    System.out.println(a.compareTo(b)); // positive integer
  }
}
