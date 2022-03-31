// Minions: Melody Lew, Nora Miller, Nicole Zhou
// APCS pd06
// HW85 -- Leon Leonwood Stack
// 2022-03-30
// time spent: 1.5 hr

/***
 * class Stckr
 * SKELETON
 * driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
 **/

public class Stckr
{
  public static void main( String[] args )
  {

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // USAGE: un-comment exactly 1 assignment below
    Stack<Integer> cakes = new ALStack<Integer>(5);
    // Stack<Integer> cakes = new LLStack<Integer>(5);
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    System.out.println("Testing...beginning items: " + cakes.isEmpty());

    System.out.println("Adding...");
    for (int i = 0; i < 5; i++){
      cakes.push(i);
      System.out.println(cakes.peekTop());
    }

    cakes.push(22);

    System.out.println();
    while (!(cakes.isEmpty())){
      System.out.println(cakes.pop());
    }

  }//end main
}//end class
