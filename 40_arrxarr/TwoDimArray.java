// Team: doubleN (Nicole Zhou, Duck, Nada Hameed, Ray)
// APCS
// HW40: Demand A Raise
// 2021-11-30
// time spent: 1hr

/*
DISCO:
1) Let's say "a" is a 2D array (not empty). Running "System.out.println(a[0])" does not print the value of the first element, it returns an address.
2) To access a row, do "a[index]"
3) When "a" is a 2D array, you can still use "a.length"
4) To access a particular element of a row, do "a[rowIndex][subArrayIndex]"
QCC:
1) Is there an easier way to print out each row of a 2D array?
*/

public class TwoDimArray{

  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOR loop
  public static void print1( int[][] a ){
    // YOUR IMPLEMENTATION HERE
    for (int i = 0; i < a.length; i += 1){
      int[] sub = a[i];
      String row = "[" + sub[0];
      for (int x = 1; x < sub.length; x += 1){
        row += ", " + sub[x];
      }
      System.out.println(row + "]");
    }
  }

  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOREACH loop
  public static void print2( int[][] a ){
    // YOUR IMPLEMENTATION HERE
    for (int[] sub : a){
      String row = "[" + sub[0];
      for (int x = 1; x < sub.length; x += 1){
        row += ", " + sub[x];
      }
      System.out.println(row + "]");
    }
  }

  //postcond: returns sum of all items in 2D int array a
  public static int sum1( int[][] a ){
    // YOUR IMPLEMENTATION HERE
    int sum = 0;
    for (int[] sub : a){
      for (int x : sub){
        sum += x;
      }
    }
    return sum;
  }

  //postcond: returns sum of all items in 2D int array a
  //          * uses helper fxn sumRow
  public static int sum2( int [][] m ){
    // YOUR IMPLEMENTATION HERE
    int sum = 0;
    for (int i = 0; i < m.length; i += 1){
      sum += sumRow(i, m);
    }
    return sum;
  }

  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOR loop
  public static int sumRow( int r, int[][] a ){
    // YOUR IMPLEMENTATION HERE
    int[] sub = a[r];
    int sum = 0;
    for (int i = 0; i < sub.length; i += 1){
      sum += sub[i];
    }
    return sum;
  }

  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOREACH loop
  public static int sumRow2(int r, int[][] m){
    // *** YOUR IMPLEMENTATION HERE ***
    int summer = 0;
    int[] sub = m[r];
    for (int x : sub){
      summer += x;
    }
    return summer;
  }

  public static void main( String [] args ){
      int [][] m1 = new int[4][2];
      int [][] m2 = { {2,4,6}, {3,5,7} };
      int [][] m3 = { {2}, {4,6}, {1,3,5} };
      print1(m1);
      print1(m2);
      print1(m3);
      print2(m1);
      print2(m2);
      print2(m3);
      System.out.print("testing sum1...\n");
      System.out.println("sum m1 : " + sum1(m1));
      System.out.println("sum m2 : " + sum1(m2));
      System.out.println("sum m3 : " + sum1(m3));
      System.out.print("testing sum2...\n");
      System.out.println("sum m1 : " + sum2(m1));
      System.out.println("sum m2 : " + sum2(m2));
      System.out.println("sum m3 : " + sum2(m3));
      /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    // your own custom test cases welcomed and encouraged
  }
}//end class TwoDimArray
