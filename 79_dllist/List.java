// Team: Minions (Melody Lew, Nicole Zhou, Nora Miller)
// APCS pd06
// HW79: A YouTube Host Are You
// 2022-03-17
// time spent: 1 hr

/***
 * interface List
 * subset of actual Java List interface
 * Specifies actions a List must be able to perform.
 *
 * If placed in current working dir, will be consulted instead of
 *  built-in Java library interface.
 **/

 public interface List{
   //add node to list, containing input String as its data
   public boolean add( String x );

   //insert at specified index
   public void add( int index, String newVal );

   //remove node from list, return its data
   public String remove( int index );

   //return data in element at position i
   public String get( int i );

   //overwrite data in element at position i
   public String set( int i, String x );

   //return length of list
   public int size();

 }//end interface
