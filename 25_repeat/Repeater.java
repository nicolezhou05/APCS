// Team: Hydration (Brianna, Pepe, Nicole, Duck)
// APCS
// HW25: Do I repeat myself?
// 2021-10-26
// Time spent: 1 hr

/*
DISCO:
1) In a recursive function, it will call itself, making something like a loop.
2) In a recursive function, you need a place to store information so that it doesn't get lost.
QCC:
1) In what situations should we choose recursive methods over while loops and vice versa?
*/

public class Repeater {

  public static String fenceW(int numPosts){
    int x = 1;
    String fence = "|";
    if (numPosts == 0){
      return "No fence";
    }
    while (x < numPosts){
      fence += "--|";
      x += 1;
    }
    return fence;
  }

  public static String fenceR(int numPosts){
    String fence = "|";
    if (numPosts == 0){
      return "No fence";
    }
    else if (numPosts == 1){
      return fence;
    }
    else {
      fence = fenceR(numPosts - 1) + "--|";
    }
    return fence;
  }


  public static void main(String[] args){
    // test fenceW
    System.out.println("Testing fenceW");
    System.out.println(fenceW(1));
    System.out.println(fenceW(2));
    System.out.println(fenceW(3));
    //test fenceR
    System.out.println("\nTesting fenceR");
    System.out.println(fenceR(1));
    System.out.println(fenceR(2));
    System.out.println(fenceR(3));
  }

}
