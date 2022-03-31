// Minions: Melody Lew, Nora Miller, Nicole Zhou
// APCS pd06
// HW85 -- Leon Leonwood Stack
// 2022-03-30
// time spent: 1.5 hr

import java.util.ArrayList;

public class ALStack<PANCAKE> implements Stack<PANCAKE>{

  private ArrayList<PANCAKE> _content;
  private int _capacity;

  public ALStack (int initCapacity ){
    _content = new ArrayList<PANCAKE>();
    _capacity = initCapacity;
  }// O(1)

  public boolean isEmpty(){
    return (_content.size() == 0);
  }

  public PANCAKE peekTop(){
    return _content.get(_content.size() - 1);
  }

  public PANCAKE pop() {
    PANCAKE tmp = _content.get(_content.size() -1);
    _content.remove(_content.size() - 1);
    return tmp;
  }

  public void push( PANCAKE x ) {
    if (isFull()) {
      _capacity = _capacity * 2;
      System.out.println("Capacity doubled");
    }
    _content.add(x);
  }

  public boolean isFull(){
    if (_content.size() == _capacity){
      return true;
    }
    return false;
  }// O(1)

}
