// Team: Minions (Melody Lew, Nicole Zhou, Nora Miller)
// APCS pd06
// HW80: Generically Speaking
// 2022-03-23
// time spent: 0.5 hr


public class DLLNode<T>{
  //instance vars
  private T _cargo;
  private DLLNode<T> _nextNode;
  private DLLNode<T> _prevNode;

  // constructor
  public DLLNode( T value, DLLNode<T> next, DLLNode<T> prev ){
    _cargo = value;
    _nextNode = next;
    _prevNode = prev;
  }


  //--------------v  ACCESSORS  v--------------
  public T getCargo(){
    return _cargo;
  }

  public DLLNode<T> getNext(){
    return _nextNode;
  }

  public DLLNode<T> getPrev(){
    return _prevNode;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public T setCargo( T newCargo ){
    T foo = getCargo();
    _cargo = newCargo;
    return foo;
  }

  public DLLNode<T> setNext( DLLNode<T> newNext ){
    DLLNode<T> foo = getNext();
    _nextNode = newNext;
    return foo;
  }

  public DLLNode<T> setPrev( DLLNode<T> newPrev ){
    DLLNode<T> foo = getPrev();
    _prevNode = newPrev;
    return foo;
  }
  //--------------^  MUTATORS  ^--------------

}//end class DLLNode<T>
