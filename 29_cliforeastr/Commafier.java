// Team: Hydration (Brianna, Pepe, Nicole, Duck)
// APCS
// HW29: Which Way Do You Roll?
// 2021-11-2
// time spent: 1 hr

/*
DISCO:
1) Integer.toString(x) converts int x to its String representation.
2) We can't use for(int x : args).
3) for(String s: args) allow us to enter inputs through the command line.

QCC:
1) What exactly is args and where else can you use it?
*/

public class Commafier{
  public static String commafyR(int num){
    String s = Integer.toString(num);
    if (s.length() <= 3){
      return s;
    }
    else{
      String str = "," + s.substring(s.length() - 3);
      int beginning = Integer.parseInt(s.substring(0, s.length() - 3));
      return commafyR(beginning) + str;
    }
  }

  public static String commafyF(int num){
    String s = Integer.toString(num);
    for (int x = 3; x < s.length(); x += 4){
      s = s.substring(0, s.length() - x) + "," + s.substring(s.length() - x);
    }
    return s;
  }

  public static void main(String args[]){
    //System.out.println(commafyR(1));
    //System.out.println(commafyR(100));
    //System.out.println(commafyR(1000));
    //System.out.println(commafyR(12345678));
    //System.out.println(commafyF(1));
    //System.out.println(commafyF(100));
    //System.out.println(commafyF(1000));
    //System.out.println(commafyF(12345678));
    for (String s: args){
      System.out.println(commafyR(Integer.parseInt(s)));
      System.out.println(commafyF(Integer.parseInt(s)));
    }
  }
}
