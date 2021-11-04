/***
 * Team: Hollister (Brianna, Pepe, Fang, Cat, Nicole, Duck)
 * APCS
 * HW31 -- Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay
 * 2021-11-03
 * time spent: 0.6 hr

 DISCO:
 1) When we use final on an instance variable, the value of the instance variable will never change.
 2) str.indexOf(s) returns the index of the first occurence of s in str.
 QCC:
 1) Is there anything else that indexOf() can do?

 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 ***/

public class Pig
{
  //Q: How does this initialization make your life easier?
  //A: We will know that every time we see VOWELS, it always equal "aeiou"
  private static final String VOWELS = "aeiou";


  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA( String w, String letter )
  {
    /* YOUR IMPLEMENTATION HERE */
    return w.indexOf(letter) > -1;
  }//end hasA()


  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel( String letter )
  {
    /* YOUR IMPLEMENTATION HERE */
    return hasA(VOWELS, letter);
  }


  /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w )
  {
    /* YOUR IMPLEMENTATION HERE */
    int count = 0;
    for (int x = 0; w.length() > x; x += 1){
      if (isAVowel(w.substring(x, x + 1))){
        count += 1;
      }
    }
    return count;
  }


  /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
  public static boolean hasAVowel( String w )
  {
    /* YOUR IMPLEMENTATION HERE */
    return countVowels(w) > 0;
  }


  /*=====================================
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    =====================================*/
  public static String allVowels( String w )
  {
    /* YOUR IMPLEMENTATION HERE */
    String str = "";
    for (int x = 0; w.length() > x; x += 1){
      if (isAVowel(w.substring(x, x + 1))){
        str += w.substring(x, x + 1);
      }
    }
    return str;
  }


  public static void main( String[] args )
  {
    /* YOUR TEST CALLS HERE */
    System.out.println(hasA("cat", "a")); // true
    System.out.println(hasA("cat", "p")); // false

    System.out.println(isAVowel("a")); // true
    System.out.println(isAVowel("b")); // false

    System.out.println(countVowels("meatball")); // 3
    System.out.println(countVowels("bcdfgh")); // 0

    System.out.println(hasAVowel("cat")); // true
    System.out.println(hasAVowel("zzz")); // false

    System.out.println(allVowels("meatball")); // "eaa"
    System.out.println(allVowels("bcdfgh")); // ""
  }//end main()

}//end class Pig
