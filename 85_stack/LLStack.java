// Minions: Melody Lew, Nora Miller, Nicole Zhou
// APCS pd06
// HW85 -- Leon Leonwood Stack
// 2022-03-30
// time spent: 1.5 hr

import java.util.LinkedList;

public class LLStack<PANCAKE> implements Stack<PANCAKE>{

  private LinkedList<PANCAKE> _content;
  private int _capacity;

  public LLStack (int initCapacity ){
    _content = new LinkedList<PANCAKE>();
    _capacity = initCapacity;
  }

  public boolean isEmpty(){
    return _content.size() == 0;
  }

  public PANCAKE peekTop(){
    return _content.get(0);
  }

  public PANCAKE pop(){
    return _content.removeFirst();
  }

  public void push( PANCAKE x ){
    if (isFull()){
      _capacity = _capacity * 2;
      System.out.println("Capacity doubled");
    }
    _content.addFirst(x);
  }

  public boolean isFull(){
    return _content.size() == _capacity;
  }

}
