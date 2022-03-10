public class QuickSelect{
  //--------------v  HELPER METHODS  v--------------
  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o ){
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  //print input array
  public static void printArr( int[] a ){
    for ( int o : a )
      System.out.print( o + " " );
    System.out.println();
  }

  //shuffle elements of input array
  public static void shuffle( int[] d ){
    int tmp;
    int swapPos;
    for( int i = 0; i < d.length; i++ ) {
      tmp = d[i];
      swapPos = i + (int)( (d.length - i) * Math.random() );
      swap( i, swapPos, d );
    }
  }

  //return int array of size s, with each element fr range [0,maxVal)
  public static int[] buildArray( int s, int maxVal ){
    int[] retArr = new int[s];
    for( int i = 0; i < retArr.length; i++ )
      retArr[i] = (int)( maxVal * Math.random() );
    return retArr;
  }
  //--------------^  HELPER METHODS  ^--------------


  public static int partition(int[] arr, int lower, int upper, int pvtPos){
    int v = arr[pvtPos];
    swap( pvtPos, upper, arr);
    int s = lower;
    for( int i = lower; i < upper; i++ ) {
      if ( arr[i] <= v) {
        swap( i, s, arr );
        s++;
      }
    }
    swap(s,upper,arr);
    return s;
  }//end partitioner


  public static int fastHelper( int[] arr, int lower, int upper, int pvtPos, int y){
    //int smaller = partitioner(arr, lower, upper, pvtPos);
    partition(arr, lower, upper, pvtPos);
    if (pvtPos == y){// base case
      return arr[pvtPos]; // if the pivot value is at the pivot position, you're done
    }
    if (y == arr.length -1){ // the case where you're looking for the greatest value
                             // needs to be treated separately because due to typecasting,
                             // the greatest index will never show up as a pivot.
      return arr[arr.length - 1];
    }
    else {// other cases
      if (pvtPos > y - 1){ // we need to look more in depth at the lower half
        int newPvt = (int)((pvtPos + lower)/2);
        return( fastHelper(arr, lower, pvtPos, newPvt, y));
      }
      else { // we need to look at the upper half
        int newPvt = (int)((pvtPos + upper)/2);
        return( fastHelper(arr, pvtPos, upper, newPvt, y));
      }
    }
  }

  // precond: looking for the yth smallest value in the array
  // postcond: the yth smallest value of the array (pvt)

  public static int fastSelect(int[] arr, int y){
    int firstPvt = (int) (0.5 * arr.length);
    return fastHelper(arr, 0, arr.length-1, firstPvt, y-1);
  }
}
