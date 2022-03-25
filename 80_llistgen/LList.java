// Team: Minions (Melody Lew, Nicole Zhou, Nora Miller)
// APCS pd06
// HW80: Generically Speaking
// 2022-03-23
// time spent: 0.5 hr


/***
 * class LList
 * Implements a linked list of DLLNode<T>s, each containing String data
 **/

public class LList<T> implements List<T> //interface def must be in this dir
{

  //instance vars
  private DLLNode<T> _head;
  private DLLNode<T> _tail; // last item
  private int _size;

  // constructor -- initializes instance vars
  public LList( ){
    _head = null;
    _tail = null;
    _size = 0; // so that we can modify the values later
  }


  //--------------v  List interface methods  v--------------
  public T remove(int index){
    if (_size == 0){
      return null;
    }
    else if (index == 0){
      T temp = _head.getCargo();
      _head = _head.getNext(); // we're moving the start of the array up one; the first item will get eaten by the garbage collector
      _head.setPrev( null ); // otherwise, there will be a reference to the original head
      _size -= 1;
      return temp;
    }
    else if (index > 0){
      // find the index before the one we want to remove

      DLLNode<T> pointer = _head;
      for (int i = 0; i < index - 1; i++){ // should ultimately end up at index - 1
        pointer = pointer.getNext();
      }
      // remove it (forget it)
      T temp = pointer.getNext().getCargo();
      pointer.setNext(pointer.getNext().getNext()); //creates the forward arrow
      pointer.getNext().setPrev(pointer); // the node in front of pointer should set its previous node to pointer

      // cases regarding _tail
      if (index == _size - 1) { // you're removing at the end
        _tail = _tail.getPrev();
      } // otherwise we don't need to change tail
      _size -= 1;
      return temp;
    }
    return null;
  }

  public void add( int index, T newVal ){
    if (index == 0){
      add(newVal);
      return;
    } else if (index == _size){ // you want to add something to the end of the List
      DLLNode<T> newItem = new DLLNode<T>( newVal, null, _tail); // newItem, meet tail
      _tail.setNext(newItem); // tail, meet new item
      _tail = _tail.getNext();
      _size += 1;
    } else {
      // find spot before where you need to insert newVal
      DLLNode<T> pointer = _head;
      for (int i = 0; i < index - 1; i++){ // should ultimately end up at index - 1
        pointer = pointer.getNext();
      } // pointer is now at index - 1
      DLLNode<T> newItem = new DLLNode<T>( newVal, pointer.getNext(), pointer); // forward and backward arrows from the new node
      pointer.setNext(newItem); // forward arrow to the new node
      newItem.getNext().setPrev(newItem); // backward arrow to the new node
      _size += 1;
      return;
    }
  }

  public boolean add( T newVal ){ // adds at the very front of the list
    // YOUR CODE HERE
    DLLNode<T> tmp = new DLLNode<T>( newVal, _head, null );
    _head = tmp;
    if (_size != 0){
      _head.getNext().setPrev(_head); // the old head, which is now item 1, should set its prev to the new node, item 0.
    } else { // if this is going to be the first item in the list
      _tail = _head;
    }

    _size++;
    return true;
  }


  public T get( int index ){
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    // YOUR CODE HERE
    DLLNode<T> pointer = new DLLNode("", null, null);
    pointer = _head;
    for (int i = 0; i < index; i++){
      pointer = pointer.getNext();
    }
    return pointer.getCargo();
  }


  public T set( int index, T newVal ){

    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    // YOUR CODE HERE
    DLLNode<T> pointer = new DLLNode("", null, null);
    pointer = _head;
    for (int i = 0; i < index; i++){
      pointer = pointer.getNext();
    }
    pointer.setCargo(newVal);
    return pointer.getCargo();
  }


  //return number of nodes in list
  public int size(){
    // YOUR CODE HERE
    return _size;
  }

  //--------------^  List interface methods  ^--------------



  // override inherited toString
  public String toString(){
    // YOUR CODE HERE
    DLLNode<T> pointer = new DLLNode("", null, null); // so that we don't modify the things we're going through
    pointer = _head;
    String toPrint = "[ ";
    for (int i = 0; i < _size; i++){
      toPrint += pointer.getCargo() + " ";
      pointer = pointer.getNext();
    }
    return toPrint + "]";
  }


  //main method for testing
  public static void main( String[] args ){
    LList james = new LList();

    james.add("beat");
    james.add("a");
    james.add("need");
    james.add("I");

    System.out.println( james );
    System.out.println( "size: " + james.size() );

    System.out.println( "2nd item is: " + james.get(1) );

    james.set( 1, "got" );
    System.out.println( "...and now 2nd item is: " + james.set(1,"got") );
    System.out.println( james );

    james.add(4, "yo");
    System.out.println(james);

    System.out.println(james.remove(2));
    System.out.println(james);

    System.out.println("edge cases: \n");

    james.add(0, "YO!");
    System.out.println(james);

    System.out.println(james.remove(0));
    System.out.println(james);

    LList jill = new LList();
    System.out.println(jill.remove(1));
    System.out.println(jill);
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }
}//end class LList
