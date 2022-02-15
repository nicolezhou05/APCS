// We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

public class BunnyEars{
  public static int bunnyEars(int bunnies){
    if (bunnies == 0){
      return 0;
    }
    return 2 + bunnyEars(bunnies - 1);
  }

  public static void main(String[] args){
    System.out.println(bunnyEars(0)); // 0
    System.out.println(bunnyEars(1)); // 2
    System.out.println(bunnyEars(2)); // 4
  }
}
