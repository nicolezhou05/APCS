public class EndOther{

  // Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
  public static boolean endOther(String a, String b){
    int letters;
    int place;
    String x = a.toLowerCase();
    String y = b.toLowerCase();
    if (x.length() > y.length()){
      letters = y.length();
      place = x.length() - letters;
      String end = x.substring(place, place + letters);
      return end.equals(y);
    }
    else if (x.length() < y.length()){
      letters = x.length();
      place = y.length() - letters;
      String end = y.substring(place, place + letters);
      return end.equals(x);
    }
    else{
      return x.equals(y);
    }
  }

  public static void main(String[] args){
    System.out.println(endOther("Hiabc", "abc")); // true
    System.out.println(endOther("AbC", "HiaBc")); // true
    System.out.println(endOther("abc", "abXabc")); // true
  }
}
