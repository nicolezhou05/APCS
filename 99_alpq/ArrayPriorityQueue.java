// Team: Non-Disclosure Agreement (Jing Feng, Corina Chen, Nicole Zhou)
// APCS
// HW99: Some Are More Equal Than Others, Codified
// 2022-05-13
// time spent: 0.6 hrs

import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue{
  private ArrayList<Integer> _queue;

  public ArrayPriorityQueue(){
    _queue = new ArrayList<Integer>();
  }

  // O(n)
  // first element is the one that gets dequeued first
  public void add(int x){
    if (isEmpty() || (_queue.get(_queue.size() - 1) <= x)){
      _queue.add(x);
      return;
    }
    for (int i = 0; i < _queue.size(); i++){
      if (_queue.get(i) > x){
        _queue.add(i, x);
        return;
      }
    }
  }

  // O(1)
  public boolean isEmpty(){
    return _queue.size() == 0;
  }

  // O(1)
  public int peekMin(){
    return _queue.get(0);
  }

  // O(1)
  public int removeMin(){
    return _queue.remove(0);
  }

  public String toString(){
    return "" + _queue;
  }

  public static void main(String[] args){
    ArrayPriorityQueue vipLine = new ArrayPriorityQueue();
    System.out.println(vipLine.isEmpty()); // true

    vipLine.add(5);
    vipLine.add(3);
    vipLine.add(4);
    vipLine.add(3);
    vipLine.add(6);

    System.out.println(vipLine); // [3. 3. 4. 5. 6]
    System.out.println(vipLine.isEmpty()); // false

    System.out.println(vipLine.peekMin()); // 3
    System.out.println(vipLine.removeMin()); // 3
    System.out.println(vipLine); // [3. 4. 5. 6]
  }
}
