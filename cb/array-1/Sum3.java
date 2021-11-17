public class Sum3 {

  // Given an array of ints length 3, return the sum of all the elements.
  public static int sum3(int[] nums){
    int sum = 0;
    for (int x: nums){
      sum += x;
    }
    return sum;
  }

  public static void main(String[] args){
    System.out.println(sum3([1, 2, 3])); // 6
    System.out.println(sum3([5, 11, 2])); // 18
    System.out.println(sum3([7, 0, 0])); // 7
  }
}
