// TNPG: Benjamin (Jun Hong Wang, Brian Wang, Nicole Zhou)
// APCS
// L06: Read/Review/Expand
// 2022-02-10

public class Scream {
  public static String screamify(String input) {
    input = input.toUpperCase();

    while(input.indexOf(".") != -1){
      int nextPunc = input.indexOf(".");
      if(nextPunc != input.length() - 1){
        input = input.substring(0, nextPunc) + "!" + input.substring(nextPunc + 1);
      }
      else{
        input = input.substring(0, nextPunc) + "!";
      }
    }

    //alternate code segment that does the same thing as the first while loops
    /*
    for (int i = 0; i < input.length(); i++) {
      String nextChar = new String();
      nextChar = input.substring(i, i + 1);
      if (nextChar.equals(".") ||
      nextChar.equals("?")) {
        input = input.substring(0, i) + "!" + input.substring(i + 1);
      }
    }
    */

    while(input.indexOf("?") != -1){
      int nextPunc = input.indexOf("?");
      if(nextPunc != input.length() - 1){
        input = input.substring(0, nextPunc) + "!" + input.substring(nextPunc + 1);
      }
      else{
        input = input.substring(0, nextPunc) + "!";
      }
    }

    return input;
  }

  public static void main(String[] args) {
    System.out.println(screamify("aaaaaaaa."));
    System.out.println(screamify("i am not angry, you are."));
  }
}
