// Team: Hydration (Brianna, Pepe, Nicole, Duck)
// APCS
// HW26: GCD Three Ways
// 2021-10-27
// Time spent: 1 hr

/*
DISCO:
1) If I declare an int and assign it in a while/if statement, error is returned because it might end up not getting assigned.

QCC:
1) How can I make my code concise, organized, and easy to read?

ALGO:
If two inputs are equal, the GCD is that number. If not, we replace the larger number with the difference of the two inputs. Repeat until the inputs become the same number, which is the GCD.
*/

public class Stats {

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

  public static int gcdER(int a, int b){
    int gcd;
    if (a == b){
      return a;
    }
    else if (a > b){
      gcd = gcdER((a - b), b);
    }
    else {
      gcd = gcdER(a, (b - a));
    }
    return gcd;
  }

  public static int gcdEW(int a, int b){
    while (a != b){
      if (a > b){
        a -= b;
      }
      else {
        b -= a;
      }
    }
    return a;
  }

  //Test the methods
  public static void main(String[] args){

    System.out.println("Test gcd");
    System.out.println(gcd(1,4)); // output: 1
    System.out.println(gcd(3,3)); // output: 3
    System.out.println(gcd(6,8)); // output: 2
    System.out.println(gcd(128,32)); // output: 32
    System.out.println(gcd(10,7)); // output: 1

    System.out.println("\nTest gcdER");
    System.out.println(gcdER(1,4)); // output: 1
    System.out.println(gcdER(3,3)); //output: 3
    System.out.println(gcdER(6,8)); //output: 2
    System.out.println(gcdER(128,32)); // output: 32
    System.out.println(gcdER(10,7)); //output: 1

    System.out.println("\nTest gcdEW");
    System.out.println(gcdEW(1,4)); // output: 1
    System.out.println(gcdEW(3,3)); // output: 3
    System.out.println(gcdEW(6,8)); // output: 2
    System.out.println(gcdEW(128,32)); // output: 32
    System.out.println(gcdEW(10, 7)); // output: 1
  }
}
