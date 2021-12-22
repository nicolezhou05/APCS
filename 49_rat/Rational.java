// Team: CNN (Nicole Zhou, Duck, Nada Hameed, Ray, Corina Chen, Binktop)
// APCS
// HW49: Rational Standards Compliance
// 2021-12-22
// time spent:

/*
DISCO:

QCC:

*/

public class Rational implements Comparable {
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

  public int compareTo(Object o){
    Rational r = (Rational)o;
    subtract(r);
    return numerator;
  }
}
