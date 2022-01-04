// Team: CNN (Corina Chen, Binktop, Nada Hameed, Ray, Nicole Zhou, Duck)
// APCS
// HW51: Dat Bubbly Tho
// 2022-01-03
// time spent: 0.8 hr

/******************************
 * class BubbleSort -- implements bubblesort algorithm (vanilla)
 *
 * ALGO:
 * 0. Start at one end of the array
 * 1. Compare the two consecutive objects
 * 2. If they are sorted, move on; if not, swap and move on
 * 3. Repeat steps 1 and 2 until you reach the last two elements
 * 4. Repeat 0 to 3 until there are no more swaps
 *
 * DISCO
 * 1) For the 2nd for loop in bubbleSortV, the boolean has to be "i > pass" because after p passes, the first p objects are sorted.
 *
 * QCC
 * q0: If a pass requires no swaps, what do you know?
 * a0: the array is sorted
 * q1: After pass p, what do you know?
 * a1: that the first p objects are sorted
 * q2: How many passes are necessary to completely sort?
 * a2: the number of elements - 1
 *
 ******************************/

import java.util.ArrayList;

public class BubbleSort{
  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond:  lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al ){
    int randomIndex;
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  // VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void bubbleSortV( ArrayList<Comparable> data ){
    /* YOUR IMPLEMENTATION HERE */
    int p = data.size();
    for (int pass = 0; pass < p; pass += 1){
      for (int i = p - 1; i > pass; i -= 1){
        if (data.get(i).compareTo(data.get(i - 1)) < 0){
          Comparable bigger = data.get(i - 1);
          Comparable smaller = data.get(i);
          data.set(i, bigger);
          data.set(i - 1, smaller);
        }
      }
    }
  }

  // ArrayList-returning bubbleSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input ){
    /* YOUR IMPLEMENTATION HERE */
    ArrayList copy = new ArrayList<Comparable>();
    for (Comparable element : input){
      copy.add(element);
    }
    bubbleSortV(copy);
    return copy;
  }

  public static void main( String [] args ){
    /*===============for VOID methods=============
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      bubbleSortV(glen);
      System.out.println( "ArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      bubbleSortV(coco);
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      ============================================*/

    /*==========for AL-returning methods==========
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = bubbleSort( glen );
      System.out.println( "sorted version of ArrayList glen:\n" + glenSorted );
      System.out.println( "ArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = bubbleSort( coco );
      System.out.println( "sorted version of ArrayList coco:\n" + cocoSorted );
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      System.out.println( coco );
      ============================================*/
  }//end main
}//end class BubbleSort
