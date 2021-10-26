public class Driver {

  public static void main(String[] args) {
    Coin Duck = new Coin();
    Coin Cat = new Coin();

    //Flip until x heads have come up
    int x = 3500;
    while (Duck.getHeadsCtr() + Cat.getHeadsCtr() < x){
      Duck.flip();
      Cat.flip();
    }
    System.out.println("1) Flip until you have 3500 heads");
    System.out.println("Duck: " + Duck.getHeadsCtr() + " heads");
    System.out.println("Number of flips for Duck: " + Duck.getFlipCtr());
    System.out.println("Cat: " + Cat.getHeadsCtr() + " heads");
    System.out.println("Number of flips for Cat: " + Cat.getFlipCtr() + "\n");

    //Reset
    Duck.reset("heads", 0.5);
    Cat.reset("heads", 0.5);

    //Flip until y matches have occurred
    int y = 0;
    while (y < 3500){
      Duck.flip();
      Cat.flip();
      if (Duck.equals(Cat)){
        y += 1;
      }
    }
    System.out.println("2) Flip until you have 3500 matches");
    System.out.println("Number of flips it took for each person: " + Duck.getFlipCtr() + "\n");

    //Reset
    Duck.reset("heads", 0.5);
    Cat.reset("heads", 0.5);

    //Flip at least 65536 matches have come up, and the number of matches is divisible by 2005
    int matches = 0;
    while (!(matches % 2005 == 0) || !(matches >= 65536)){
      Duck.flip();
      Cat.flip();
      if (Duck.equals(Cat)){
        matches += 1;
      }
    }
    System.out.println("3) Flip until at least 65536 matches have come up, and the number of matches is divisible by 2005");
    System.out.println("Number of flips for Duck: " + Duck.getFlipCtr());
    System.out.println("Number of flips for Cat: " + Cat.getFlipCtr());
    System.out.println("Number of matches: " + matches);


  }// end main()

}// end class
