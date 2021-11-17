public class Sum13{

  // Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
  public static int sum13(int[] nums){
    if (nums.length == 0){
      return 0;
    }
    int sum = 0;
    for (int i = 0; i < nums.length; i += 1){
      if (nums[i] != 13){
        sum += nums[i];
      }
      else{
        i += 1;
      }
    }
    return sum;
  }

  public static void main(String[] args){
    System.out.println(sum13([1, 2, 2, 1])) // 6
    System.out.println(sum13([1, 1])) // 2
    System.out.println(sum13([1, 2, 2, 1, 13])) // 6
  }
}
