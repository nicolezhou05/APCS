// Team: doubleN (Nicole Zhou, Duck, Nada Hameed, Ray)
// APCS
// HW43: Array of Steel
// 2021-12-06

/*
DISCO:
1) Review of toString: when we override toString, it automatically displays the information of the object the way we wanted.
QCC:
1) Still a bit confused on Wrapper and SuperArray.
*/

public class SuperArray{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray(){
    /* YOUR IMPLEMENTATION HERE */
    _data = new int[10];
    _size = 10;
  }


  //output SuperArray in [a,b,c] format
  public String toString(){
    /* YOUR IMPLEMENTATION HERE */
    String list = "[" + _data[0];
    for (int i = 1; i < _size; i += 1){
      list += ", " + _data[i];
    }
    return list + "]";
  }


  //double capacity of SuperArray
  private void expand(){
    /* YOUR IMPLEMENTATION HERE */
    _size = _size * 2;
    int[] doubleCap = new int[_size];
    for (int i = 0; i < _data.length; i += 1){
      doubleCap[i] = _data[i];
    }
    _data = doubleCap;
  }


  //accessor -- return value at specified index
  public int get( int index ){
    /* YOUR IMPLEMENTATION HERE */
    return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal ){
    /* YOUR IMPLEMENTATION HERE */
    int oldVal = _data[index];
    _data[index] = newVal;
    return oldVal;
  }


  //main method for testing
  public static void main( String[] args ){
      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );

      for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
      }

      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);

      for( int i = 0; i < 3; i++ ) {
      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);
      }
      /*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()

}//end class
