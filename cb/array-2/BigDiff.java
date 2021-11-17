public class BigDiff {

  // Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.
  public static int bigDiff(int[] nums){
    if (nums.length == 1){
      return 0;
    }
    int x = nums[0];
    int y = nums[0];
    for (int i = 1; i < nums.length; i += 1){
      x = Math.max(x, nums[i]);
      y = Math.min(y, nums[i]);
    }
    return x - y;
  }

  public static void main(String[] args){
    System.out.println(bigDiff([10, 3, 5, 6])); // 7
    System.out.println(bigDiff([7, 2, 10, 9])); // 8
    System.out.println(bigDiff([2, 10, 7, 2])); // 8
  }
}
