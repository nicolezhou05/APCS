public class MySorts{

  /* ~~~~~~~~~~~~~~~~~~~ Bubble Sort ~~~~~~~~~~~~~~~~~~~
  0) Start at one end of the array
  1) Compare the two adjacent objects
  2) If they are sorted, move; if not, swap and move on
  3) Repeat steps 1-2 until you reach the last two elements
  4) Repeat steps 0-3 until no more swaps are needed
  */
  public static void bubbleSort( ArrayList<Comparable> data ){
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

  /* ~~~~~~~~~~~~~~~~~~~ Selection Sort ~~~~~~~~~~~~~~~~~~~
  0) Scan the array and find the largest number and swap with the last position.
  1) Scan the array (that doesn't include the last position) and find the largest number.
  2) Swap that number with the one in second to last position.
  3) Continue until you reach the end.
  */
  public static void selectionSort( ArrayList<Comparable> data ){
    //note: this version places greatest value at "rightmost" end
    int maxPos; //maxPos will point to position of SELECTION (greatest value)
    for(int pass = data.size() - 1; pass > 0; pass -= 1) {
      maxPos = pass;
      for(int i = 0; i < pass; i += 1) {
        if (data.get(i).compareTo(data.get(maxPos)) > 0){
          maxPos = i;
        }
      }
      Comparable bigger = data.get(maxPos);
      data.set(maxPos, data.get(pass));
      data.set(pass, bigger);
    }
  }

  /* ~~~~~~~~~~~~~~~~~~~ Insertion Sort ~~~~~~~~~~~~~~~~~~~
  0) Separate array into sorted and unsorted region. First element is in sorted region and partition is 1
  1) Walk an element from unsorted region to where it belongs in sorted region
  2) Increase size of partition by 1
  3) Repeat 1-2 until array is completely sorted
  */
  public static void insertionSort( ArrayList<Comparable> data ) {
    for(int partition = 1; partition < data.size(); partition += 1) {
      for(int i = partition; i > 0; i -= 1) {
        if (data.get(i).compareTo(data.get(i - 1)) < 0) {
          Comparable bigger = data.get(i - 1);
          data.set(i - 1, data.get(i));
          data.set(i, bigger);
        }
        else
          break;
      }
    }
  }
}
