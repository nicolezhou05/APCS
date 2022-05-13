import java.util.ArrayList;

public class ArrayPriorityQueue<T> implements PriorityQueue<T>{
  private ArrayList<T> _queue;

  public ArrayPriorityQueue(){
    _queue = new ArrayList<T>();
  }

  public void add(T x){
    for (int i = 0; i < _queue.size(); i++){
      if (_queue.get(i).compareTo(x) > 0){
        
      }
    }
  }

  // O(1)
  public boolean isEmpty(){
    return _queue.size() == 0;
  }

  public T peekMin(){

  }

  public T removeMin(){

  }
}
