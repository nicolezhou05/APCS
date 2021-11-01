public class XyzThere{

  // Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
  public static boolean xyzThere(String str){
    if (str.length() >= 3){
      if (str.substring(0, 3).equals("xyz")){
        return true;
      }
      for (int x = 0; x < str.length() - 2; x++){
        if (str.substring(x, x + 3).equals("xyz") && !(str.substring(x - 1, x).equals("."))){
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args){
    System.out.println(xyzThere("abcxyz")); // true
    System.out.println(xyzThere("abc.xyz")); // false
    System.out.println(xyzThere("xyz.abc")); // true
  }
}
