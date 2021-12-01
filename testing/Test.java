public class Main
{
  int a = 251;
  public static void main(String[] args) {
    Main demo = new Main();
    System.out.println("Value of a before: " + demo.a);
    demo.change(demo.a);
    System.out.println("Value of a after: " + demo.a);
  }

  public void change(int target) {
    target += 100;
  }
}
