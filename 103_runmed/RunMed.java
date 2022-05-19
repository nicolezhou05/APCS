// Team: Non-Disclosure Agreement (Jing Feng, Corina Chen, Nicole Zhou)
// APCS
// HW103: Erica's Friends, Hugo, and The One in the Middle
// 2022-05-18
// time spent: 1.5 hrs

/*
ALGO:
0) Create a maxheap and a minheap
1) Given a stream of numbers, put the first number in the maxheap
2) Compare with the next number in the stream
      - If nextVal < maxHeapRoot, add to maxheap
      - Otherwise, add to minheap
3) If the size difference between the two heaps is not < 2, balance the heaps (remove from bigger, adding that to smaller)
4) Repeat until gone through entire stream of numbers
5) Median is:
      - mean of the roots of the heaps (if heap sizes are equal)
      - root of bigger heap (if heap sizes are not equal)
*/

import java.util.NoSuchElementException;

public class RunMed{
  private ALHeapMax lilVals;
  private ALHeapMin bigVals;

  public RunMed(){
    lilVals = new ALHeapMax();
    bigVals = new ALHeapMin();
  }

  public double getMedian(){
    if (lilVals.size() == 0 && bigVals.size() == 0){
      throw new NoSuchElementException();
    }
    else if (lilVals.size() == bigVals.size()){
      return (lilVals.peekMax() + bigVals.peekMin()) / 2.0;
    }
    else if (lilVals.size() > bigVals.size()){
      return lilVals.peekMax();
    }
    else{
      return bigVals.peekMin();
    }
  }

  public void add(Integer newVal){
    if (lilVals.size() == 0 && bigVals.size() == 0){
      lilVals.add(newVal);
    }
    else if (newVal < lilVals.peekMax()){
      lilVals.add(newVal);
    }
    else{
      bigVals.add(newVal);
    }

    if (lilVals.size() > bigVals.size() + 1){
      bigVals.add(lilVals.removeMax());
    }
    else if (lilVals.size() + 1 < bigVals.size()){
      lilVals.add(bigVals.removeMin());
    }
  }
}
