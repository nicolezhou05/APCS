// Team: CNN (Nicole Zhou, Duck, Nada Hameed, Ray, Corina Chen, Binktop)
// APCS
// HW49: Rational Standards Compliance
// 2021-12-22
// time spent: 0.7 hr

/*
DISCO:
1) _Object_ instanceof _Class_ returns a boolean. Can be used in conditionals.
2) throw new ClassCastException(_str_); returns an error with _str_ label.
3) instanceof is a is-a.
QCC:
1) Still confused about objects and more clarification on instanceof is needed.
*/

public class Driver {
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
    System.out.println("a: " + a); // 8/12
    System.out.println("b: " + b); // 1/2

    System.out.println("\nTesting reduce():");
    c.reduce();
    System.out.println("c: " + c); // 2/9

    System.out.println("\nTesting compareTo():");
    System.out.println(a.compareTo(b)); // positive integer

    //String str = "hello";
    Rational d = new Rational(2, 9);
    Integer x = 2;
    Rational f = new Rational(2, 1);

    System.out.println("\nTesting object:");
    System.out.println(c.equals(d)); // true
    System.out.println(c.compareTo(d)); // 0
    System.out.println(f.equals(x)); // false
    System.out.println(f.compareTo(x)); // returns an error
  }
}
