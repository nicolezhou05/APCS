public class CountHi{

  // Return the number of times that the string "hi" appears anywhere in the given string.
  public static int countHi(String str) {
    int count = 0;
    for (int x = 0; x < str.length() - 1; x++){
      if (str.substring(x, x + 2).equals("hi")){
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args){
    System.out.println(countHi("abc hi ho")); // 1
    System.out.println(countHi("ABChi hi")); // 2
    System.out.println(countHi("hihi")); // 2
  }
}
