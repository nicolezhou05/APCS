public class DoubleChar{

  // Given a string, return a string where for every char in the original, there are two chars.
  public static String doubleChar(String str) {
    int x = 0;
    String output = "";
    while (x < str.length()){
      String letter = str.substring(x, x + 1);
      output = output + letter + letter;
      x ++;
    }
    return output;
  }

  public static void main(String[] args){
    System.out.println(doubleChar("The")) // TThhee
    System.out.println(doubleChar("AAbb")) // AAAAbbbb
    System.out.println(doubleChar("Hi-There")) // HHii--TThheerree
  }
}
