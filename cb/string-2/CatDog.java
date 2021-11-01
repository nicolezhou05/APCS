public class CatDog{

  // Return true if the string "cat" and "dog" appear the same number of times in the given string.
  public static boolean catDog (String str) {
    int countCat = 0;
    int countDog = 0;
    for (int x = 0; x < str.length() - 2; x++){
      if (str.substring(x, x + 3).equals("cat")){
        countCat++;
      }
      if (str.substring(x, x + 3).equals("dog")){
        countDog++;
      }
    }
    return countCat == countDog;
  }

  public static void main(String[] args){
    System.out.println(catDog("catdog")); // true
    System.out.println(catDog("catcat")); // false
    System.out.println(catDog("1cat1cadodog")); // true
  }
}
