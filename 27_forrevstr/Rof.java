// Team: LNN (Lior Polischouk, Nakib Adebin, Nicole Zhou)
// APCS
// HW27: FOR the Love of Strings
// 2021-10-28
// time spent: 1.3 hr

/*
DISCO:
0) s.length outputs the amount of characters in a string.
1) s.substring(x,y) outputs the char inbetween the xth and yth index of s.
2) s.substring(x) will assume that you want it to go from index x to the end.
3) For recursive functions, you need to avoid initializing variables because those variables will get reset when you make a function call inside of the function.

QCC:
0) What is the best way to design a recursive algorithm?
*/

public class Rof {
  public static String fenceF(int posts){
    String output = "|";
    if (posts == 0){
      return "No fence";
    }
    for (int x = 1; x < posts; x ++){
      output += "--|";
    }
    return output;
  }

  public static String reverseF(String s){
    String output = "";
    for (int i = s.length() - 1; i >= 0; i --){
      output += s.substring(i, i + 1);
    }
    return output;
  }

  public static String reverseR(String s){
    int x = s.length();
    if (s.length() == 1){
      return s;
    }
    else{
      String last = s.substring(x - 1, x);
      return last + reverseR(s.substring(0, x - 1));
    }
  }

  public static void main(String[] args){
    System.out.println("Testing fenceF");
    System.out.println(fenceF(0));
    System.out.println(fenceF(1));
    System.out.println(fenceF(2));
    System.out.println(fenceF(3));

    System.out.println("\nTesting reverseF");
    System.out.println(reverseF("stressed"));

    System.out.println("\nTesting reverseR");
    System.out.println(reverseR("stressed"));
  }
}
