//Team: doubleN (Nicole Zhou, Duck, Nada Hameed, Ray)
//APCS
//HW35
//2021-11-15
//time spent: 0.7 hr

/*
DISCO:
1) Many teams used helper methods to help with the recursions.
QCC:
1) Is there a way for us to better learn how to write recursions?
*/

public class Loopier{

  public static void ranInt(int[] a){
    for (int i = 0; i < a.length; i += 1){
      a[i] = (int)(Math.random() * 100);
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

  public static int linSearchR(int[] a, int target){
    if (a.length == 0){
      return -1;
    }
    if (a[0] == target){
      return 0;
    }
    int[] newA = new int[a.length - 1];
    for (int i = 1; i < a.length; i += 1){
      newA[i - 1] = a[i];
    }
    if (linSearchR(newA, target) == -1){
      return -1;
    }
    return 1 + linSearchR(newA, target);
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

  public static int freqRec(int[] a, int target){
    if (a.length == 0){
      return 0;
    }
    int count;
    if (a[0] == target){
      count = 1;
    }
    else{
      count = 0;
    }
    int[] newA = new int[a.length - 1];
    for (int i = 1; i < a.length; i += 1){
      newA[i - 1] = a[i];
    }
    return count + freqRec(newA, target);
  }

  public static void main(String[] args){
    int[] a = new int[5];
    ranInt(a);
    System.out.println(arrayToString(a)); // 5 random int

    int[] b = {1, 2, 3, 0, 3};
    System.out.println(arrayToString(b)); // [1, 2, 3, 0, 3]
    System.out.println(linSearch(b, 3)); // 2
    System.out.println(linSearchR(b, 3)); // 2
    System.out.println(freq(b, 3)); // 2
    System.out.println(freqRec(b, 3)); // 2
  }
}
