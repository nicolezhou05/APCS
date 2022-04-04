//Minions: Melody Lew, Nora Miller, Nicole Zhou
//APCS pd06
//HW87 - The English Do Not Wait In Line for Soup
//2022-04-04
//time spent: 1.5 hrs

/**
DISCO:
0) In order to be able to use LLNode, we made a nested class. Compiling it gives us NodeQueue$LLNode.class
1) queue can be either FIFO or LILO

QCC:
0) How does modifying pointer also modify _queue? (lines 38-43 of enqueue method)
*/

public class NodeQueue<QUASAR> implements Queue<QUASAR>{
  private LLNode<QUASAR> _queue;
  private int _size;

  public NodeQueue(){
    _queue = null;
    _size = 0;
  }

  // assumning that queue is not empty
  public QUASAR dequeue(){
    QUASAR retVal = _queue.getCargo();
    _queue = _queue.getNext();
    _size--;
    return retVal;
  }

  public void enqueue( QUASAR x ){
    if (isEmpty()){
      _queue = new LLNode<QUASAR>(x, null);
    }
    else{
      LLNode<QUASAR> pointer = _queue;
      for (int i = 0; i < _size - 1; i++){
        pointer = pointer.getNext();
      }
      LLNode<QUASAR> newItem = new LLNode(x, null);
      pointer.setNext(newItem);
    }
    _size++;
  }

  public boolean isEmpty(){
    return _queue == null;
  }

  public QUASAR peekFront(){
    return _queue.getCargo();
  }

  public String toString(){
    String str = "";
    LLNode<QUASAR> temp = _queue;
    for (int i = 0; i < _size; i++){
      str += temp.getCargo() + " ";
      temp = temp.getNext();
    }
    return str;
  }

  private class LLNode<QUASAR>{
    //instance vars
    private QUASAR _cargo;
    private LLNode<QUASAR> _nextNode;

    public LLNode(QUASAR value, LLNode<QUASAR> next){
      _cargo = value;
      _nextNode = next;
    }

    public QUASAR getCargo(){
      return _cargo;
    }

    public LLNode getNext(){
      return _nextNode;
    }

    public QUASAR setCargo(QUASAR newCargo){
      QUASAR foo = getCargo();
      _cargo = newCargo;
      return foo;
    }

    public LLNode setNext(LLNode newNext){
      LLNode foo = getNext();
      _nextNode = newNext;
      return foo;
    }

    public String toString(){
      return _cargo.toString();
    }
  } // end LLNode

  public static void main(String[] args){
    NodeQueue<String> line = new NodeQueue<String>();
    System.out.println(line.isEmpty()); // true

    line.enqueue("this");
    line.enqueue("is");
    line.enqueue("team");
    line.enqueue("minions");

    System.out.println(line); // this is team minions
    System.out.println(line.isEmpty()); // false
    System.out.println(line.peekFront()); // this

    line.dequeue();
    System.out.println(line); // is team minions
    System.out.println(line.peekFront()); // is
  }
} // end NodeQueue
