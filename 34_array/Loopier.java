//Team: doubleN (Nicole Zhou, Duck, Nada Hameed, Ray)
//APCS
//HW34: A Pirate's Life for Me
//2021-11-14
//time spent: 1.5 hr

/*
DISCO:
1) You can use "new" to change length of an array: arrayVar = new type[lenYouWant];
2) arrayVar.length (*NOT a METHOD*) returns the number of elements in an array.
3) Use arrayVar[index] to access an element in the array.
4) Array variables are just references of an array. Changes made to one are also made on the other.
5) To actually copy the array, create a new array and copy elements from one to the other.

QCC:
1) Is there a way to access multiple elements in an array?
2) Is there something similiar to .indexOf() for arrays?
*/

import java.util.Random;

public class Loopier{

  public static void ranInt(int[] a){
    Random random = new Random();
    for (int i = 0; i < a.length; i += 1){
      a[i] = random.nextInt();
    }
  }

  public static String arrayToString(int[] a){
    String s = "[" + a[0];
    for (int i = 1; i < a.length; i += 1){
      s += ", " + a[i];
    }
    return s + "]";
  }

  public static int linSearch(int[] a, int target){
    for (int i = 0; i < a.length; i += 1){
      if (a[i] == target){
        return i;
      }
    }
    return -1;
  }

  //Not exactly sure how to do this
  public static int linSearchR(int[] a, int target){
    for (int i = 0; i < a.length; i += 1){
      if (a[i] == target){
        return i;
      }
      else{
        int[] newA = new int[a.length - 1];
        linSearchR(newA, target);
      }
    }
    return -1;
  }

  public static int freq(int[] a, int target){
    int count = 0;
    for (int i = 0; i < a.length; i += 1){
      if (a[i] == target){
        count += 1;
      }
    }
    return count;
  }

  //not exactly sure how to do this
  public static int freqRec(int[] a, int target){
    int count = 0;
    for (int i = 0; i < a.length; i += 1){
      if (a[i] == target){
        count += 1;
      }
      else{
        int[] newA = new int[a.length - 1];
        freqRec(newA, target);
      }
    }
    return count;
  }

  public static void main(String[] args){
    int[] a = new int[5];
    ranInt(a);
    System.out.println(arrayToString(a)); // 5 random int

    int[] b = {1, 2, 3, 4, 3};
    System.out.println(arrayToString(b)); // [1, 2, 3, 4, 3]
    System.out.println(linSearch(b, 3)); // 2
    System.out.println(linSearchR(b, 3)); // 2
    System.out.println(freq(b, 3)); // 2
    System.out.println(freqRec(b, 3)); // 2
  }
}
