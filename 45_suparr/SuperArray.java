// Team: CNN (Nicole Zhou, Duck, Nada Hameed, Ray, Corina Chen, Binktop)
// APCS
// HW45: Array of Titanium
// 2021-12-08
// time spent: 0.7 hr

/*
DISCO:
1) If you just run "public class SuperArray implements ListInt", error is returned.
2) Multiple interfaces can be implemented by using a comma.
3) Return types of the methods have to be the same.
QCC:
1) I am still not sure what interfaces and implements do.
*/

public class SuperArray implements ListInt{
  private int[] _data;  //underlying ("encapsulated") container
  private int _size;    //number of elements in this SuperArray

  //default constructor – initializes 10-item array
  public SuperArray(){
    _data = new int[10];
    _size = 0;
  }

  //output SuperArray in [a,b,c] format
  public String toString(){
    String foo = "[";
    for( int i = 0; i < _size; i++ ) {
      foo += _data[i] + ",";
    }
    if ( foo.length() > 1 )
      //shave off trailing comma
      foo = foo.substring( 0, foo.length()-1 );
    foo += "]";
    return foo;
  }

  //double capacity of SuperArray
  private void expand(){
    int[] temp = new int[ _data.length * 2 ];
    for( int i = 0; i < _data.length; i++ )
      temp[i] = _data[i];
    _data = temp;
  }

  //accessor -- return value at specified index
  public int get( int index ){
    return _data[index];
  }

  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal ){
    int temp = _data[index];
    _data[index] = newVal;
    return temp;
  }

  //adds an item after the last item
  public boolean add( int newVal ){
    /* YOUR IMPLEMENTATION HERE */
    _data[_size] = newVal;
    _size += 1;
    return true;
  }

  //inserts an item at index
  public boolean add( int index, int newVal ){
    /* YOUR IMPLEMENTATION HERE */
    if (index >= _size){
      return false;
    }
    if (_size >= _data.length){
      expand();
    }
    for (int i = _size; i > index; i -= 1){
      _data[i] = _data[i - 1];
    }
    _data[index] = newVal;
    _size += 1;
    return true;
  }

  //removes the item at index
  //shifts elements left to fill in newly-empted slot
  public boolean remove( int index ){
    /* YOUR IMPLEMENTATION HERE */
    for (int i = index; i < _size - 1; i += 1){
      _data[i] = _data[i + 1];
    }
    _size -= 1;
    return true;
  }

  //return number of meaningful items in _data
  public int size(){
    /* YOUR IMPLEMENTATION HERE */
    return _size;
  }

  //main method for testing
  public static void main( String[] args ){
    ListInt something = new SuperArray();
    System.out.println(something.add(8));
    System.out.println(something.add(3));
    System.out.println(something.add(1, 2));
    System.out.println(something.remove(0));
    System.out.println(something);
    System.out.println(something.size());
  }//end main()
}//end class
