/***
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm:

  ***/

/*
Jun Hong Wang, Nicole Zhou
APCS pd6
2022-02-08
HW61: Instructions so Simple...
Time spent: 1.5 hrs

DISCO:

QCC:
Part of the reason why it took me so long to finish this is because of some variable mess ups.
Another big part of what I messed up was not devising a way to split the array into two halves, and I ran into the problem while implementing.

I believe mergesort is an nlogn sort in time complexity.
How would it stack up with the n^2 sorts in terms of efficiency, given different input sizes?
Splitting then merging again seems kind of inefficient, and I feel like adds extra steps.
*/

public class MergeSort
{
  /******************************************************
   * int[] merge(int[],int[])
   * Merges two input arrays
   * Precond:  Input arrays are sorted in ascending order
   * Postcond: Input arrays unchanged, and
   * output array sorted in ascending order.
   ******************************************************/
  private static int[] merge( int[] a, int[] b )
  {
    int[] _merged = new int[a.length + b.length];
    int aIndex, bIndex, mIndex;
    aIndex = 0;
    bIndex = 0;
    mIndex = 0;
    while (aIndex < a.length && bIndex < b.length) {
      if (a[aIndex] > b[bIndex]) {
        _merged[mIndex] += b[bIndex];
        bIndex++;
      } else {
        _merged[mIndex] += a[aIndex];
        aIndex++;
      }
      mIndex++;
    }

    if (aIndex >= a.length) {
      while (bIndex < b.length) {
        _merged[mIndex] += b[bIndex];
        mIndex++;
        bIndex++;
      }
    } else if (bIndex >= b.length) {
      while (aIndex < a.length) {
        _merged[mIndex] += a[aIndex];
        mIndex++;
        aIndex++;
      }
    } else {
      return _merged;
    }
    return _merged;
  }//end merge()


  /******************************************************
   * int[] sort(int[])
   * Sorts input array using mergesort algorithm
   * Returns sorted version of input array (ascending)
   ******************************************************/

  public static int[] sort( int[] arr )
  {
    if (arr.length < 2) {
      return arr;
    }
    else {
      int _mi = arr.length / 2;
      int[] _lo = new int[_mi];
      int[] _hi = new int[arr.length - _mi];
      for (int i = 0; i < _lo.length; i++) {
        _lo[i] = arr[i];
      }
      for (int j = _mi; j < arr.length; j++) {
        _hi[j - _mi] = arr[j];
      }
      //printArray(_lo);
      //printArray(_hi);
      int[] _loSort = sort(_lo);
      int[] _hiSort = sort(_hi);

      int[] res = new int[arr.length];
      res = merge(_loSort, _hiSort);
      printArray(res);
      return res;
    }
  }//end sort()



  //-------------------HELPERS-------------------------
  //tester function for exploring how arrays are passed
  //usage: print array, mess(array), print array. Whaddayasee?
  public static void mess( int[] a ) {
    for( int i = 0 ; i<a.length; i++ )
      a[i] = 0;
  }

  //helper method for displaying an array
  public static void printArray( int[] a ) {
    System.out.print("[");
    for( int i : a )
      System.out.print( i + ",");
    System.out.println("]");
  }
  //---------------------------------------------------


  //main method for testing
  public static void main( String [] args )
  {
      int[] arr0 = {0};
      int[] arr1 = {1};
      int[] arr2 = {1,2};
      int[] arr3 = {3,4};
      int[] arr4 = {1,2,3,4};
      int[] arr5 = {4,3,2,1};
      int[] arr6 = {9,42,17,63,0,512,23};
      int[] arr7 = {9,42,17,63,0,9,512,23,9};

      int[] arr8 = {1,3,5,6,7,9,11};
      int[] arr9 = {2,4,8,10};

      System.out.println("\nTesting mess-with-array method...");
      printArray( arr3 );
      mess(arr3);
      printArray( arr3 );

      System.out.println("\nMerging arr1 and arr0: ");
      printArray( merge(arr1,arr0) );

      System.out.println("\nMerging arr4 and arr6: ");
      printArray( merge(arr4,arr6) );

      // System.out.println("Merging sorted arrays arr 8 and arr 9");
      // printArray( merge(arr8, arr9));

      System.out.println("\nSorting arr4-7...");
      printArray( sort( arr4 ) );
      printArray( sort( arr5 ) );
      printArray( sort( arr6 ) );
      printArray( sort( arr7 ) );
      /*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class MergeSort
