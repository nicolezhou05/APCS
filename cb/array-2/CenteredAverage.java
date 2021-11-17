public class CenteredAverage{

  // Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.
  public static int centeredAverage(int[] nums){
    int x = nums[0];
    int y = nums[1];
    int sum = 0;
    for (int i = 0; i < nums.length; i += 1){
      x = Math.max(x, nums[i]);
      y = Math.min(y, nums[i]);
      sum += nums[i];
    }
    return (sum - x - y) / (nums.length - 2);
  }

  public static void main(String[] args){
    System.out.println(centeredAverage([1, 2, 3, 4, 100])); // 3
    System.out.println(centeredAverage([1, 1, 5, 5, 10, 8, 7])); // 5
    System.out.println(centeredAverage([-10, -4, -2, -4, -2, 0])); // -3
  }
}
