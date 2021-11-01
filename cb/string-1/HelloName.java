public class HelloName{

  // Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
  public static String helloName(String name) {
    return "Hello " + name + "!";
  }

  public static void main(Strings[] args){
    System.out.print(helloName("Bob")); // "Hello Bob!"
    System.out.print(helloName("Alice")); // "Hello Alice!"
    System.out.print(helloName("X")); // "Hello X!"
  }
}
