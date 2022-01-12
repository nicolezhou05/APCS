// Team: CNN (Corina Chen, Binktop, Nada Hameed, Ray, Nicole Zhou, Duck)
// APCS
// HW55: Never Fear, Big Oh Is Here!
// 2022-01-11
// time spent: 1 hr

/*
DISCO:
1) Big O means the number of operations done and can be checked using tests
2) If you have something like n^2 + 2 inside O(), just put O(n^2)
QCC:
1) Not sure about worst case for addBinary. You have log_2(x) and x??? Add? Multiply?
2) How does Big O Classification work for logs?
3) In what situations can we see O(xlog_2(x))?
*/

import java.util.ArrayList;

public class OrderedArrayList{

  public OrderedArrayList(){
    _data = new ArrayList<Integer>();
  }

  /*
  No best/worst case because this method is data-insensitive
  O(n), it iterates through each element and convert
  */
  public String toString(){
    return _data.toString();
  }

  /*
  Best case: last element is removed so no shifting, O(1)
  Worst case: first element is removed so every element needs to be shifted, O(n)
  */
  public Integer remove(int i){
    return _data.remove(i);
  }

  /*
  No best/worst case because this method is data-insensitive
  O(1) because no more than one operation is needed
  */
  public int size(){
    return _data.size();
  }

  /*
  No best/worst case because this method is data-insensitive
  O(1), checks the element in the array at the specified index
  */
  public Integer get(int i){
    return _data.get(i);
  }

  /*
  Check the two methods below
  */
  public boolean add(Integer newVal){
    // call exactly 1 of the helper methods below...  your favorite?
    addLinear(newVal);
    //addBinary(newVal);
    return true;
  }

  /*
  Best Case: no objects are in the array so just add, O(1)
  Worst Case: newVal is greater than the last element so comparisions are made to each element, O(n)
  */
  public void addLinear(Integer newVal){
    for( int p = 0; p < _data.size(); p++ ) {
      if ( newVal.compareTo( _data.get(p) ) < 0 ) {
        //newVal < oal[p]
        _data.add( p, newVal );
        return;
      }
    }
    _data.add( newVal ); //newVal > every item, so add to end
  }

  /*
  Best Case: no objects are in the array so just add, O(1)
  Worst Case: newVal is smaller than the 1st element so all elements need to be shifted, O(nlog_2(n))
  */
  public void addBinary(Integer newVal){
    //initialize high, low, midpt indices
    int lo = 0;
    int med = 0;
    int hi = _data.size()-1;

    while ( lo <= hi ) { //running until target is found or bounds cross

      med = (lo + hi) / 2;
      int x = _data.get(med).compareTo( newVal );

      if ( x == 0 ) {
        //equal value found, insert here
        _data.add( med, newVal );
        return;
      }
      else if ( x > 0 )
        //newVal < med, so look at lower half of data
        hi = med - 1;
      else
        //newVal > med, so look at upper half of data
        lo = med + 1;
    }
    // If you made it this far, newVal is not present.
    // So insert at lo.
    _data.add( lo, newVal );
  }
}
