public class CountCode{

  // Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
  public static int countCode(String str){
    int count = 0;
    for (int x = 0; x < str.length() - 3; x++){
      if (str.substring(x, x + 2).equals("co") && str.substring(x + 3, x + 4).equals("e")){
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args){
    System.out.print(countCode("aaacodebbb")); // 1
    System.out.print(countCode("codexxcode")); // 2
    System.out.print(countCode("cozexxcope")); // 2
  }
}
