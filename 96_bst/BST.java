/**
 * class BST
 * v1:partial
 * SKELETON
 * Implementation of the BINARY SEARCH TREE abstract data type (ADT)
 *
 * A BST maintains the invariant that, for any node N with value V,
 * L<V && V<R, where L and R are node values in N's left and right
 * subtrees, respectively.
 * (Any value in a node's left subtree must be less than its value,
 *  and any value in its right subtree must be greater.)
 *
 * This BST implementation only holds ints (its nodes have int cargo)
 */

public class BST
{

  //instance variables / attributes of a BST:
  TreeNode _root;

  /**
   * default constructor
   */
  BST()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    _root = null;
  }


  /**
   * void insert( int )
   * Adds a new data element to tree.
   */
  public void insert( int newVal )
  {
    TreeNode newNode = new TreeNode( newVal );
    /*** YOUR IMPLEMENTATION HERE ***/
    if (_root == null){
      _root = newNode;
      return;
    }
    insert(_root, newNode);
  }
  //recursive helper for insert(int)
  public void insert( TreeNode stRoot, TreeNode newNode )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    if (stRoot.getValue() > newNode.getValue()){
      if (stRoot.getLeft() == null){
        stRoot.setLeft(newNode);
      }
      else{
        insert(stRoot.getLeft(), newNode);
        return;
      }
    }
    else{
      if (stRoot.getRight() == null){
        stRoot.setRight(newNode);
      }
      else{
        insert(stRoot.getRight(), newNode);
        return;
      }
    }
  }//end insert()


  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~v~~TRAVERSALS~~v~~~~~~~~~~~~~~~~~~~~~

  // each traversal should simply print to standard out
  // the nodes visited, in order

  //process root, recurse left, recurse right
  public void preOrderTrav()
  {
    preOrderTrav( _root );
  }
  public void preOrderTrav( TreeNode currNode )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    if ( currNode == null )
	    return;
    System.out.print( currNode.getValue() + " " );
    preOrderTrav( currNode.getLeft() );
    preOrderTrav( currNode.getRight() );
  }

  //recurse left, process root, recurse right
  public void inOrderTrav()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    inOrderTrav(_root);
  }
  public void inOrderTrav( TreeNode currNode )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    if ( currNode == null )
      return;
    inOrderTrav( currNode.getLeft() );
    System.out.print( currNode.getValue() + " " );
    inOrderTrav( currNode.getRight() );
  }

  //recurse left, recurse right, process root
  public void postOrderTrav()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    postOrderTrav(_root);
  }
  public void postOrderTrav( TreeNode currNode )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    if ( currNode == null )
      return;
    postOrderTrav( currNode.getLeft() );
    postOrderTrav( currNode.getRight() );
    System.out.print( currNode.getValue() + " "  );
  }

  //~~~~~~~~~~~~~^~~TRAVERSALS~~^~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



  /*****************************************************
  * TreeNode search(int)
  * returns pointer to node containing target,
  * or null if target not found
  *****************************************************/
  TreeNode search( int target )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    return searchHelper(target, _root);
  }

  TreeNode searchHelper(int target, TreeNode currNode){
    if (currNode == null){
      return null;
    }
    if (target == currNode.getValue()){
      return currNode;
    }
    else if (target < currNode.getValue()){
      return searchHelper(target, currNode.getLeft());
    }
    else{
      return searchHelper(target, currNode.getRight());
    }
  }


  /*****************************************************
  * int height()
  * returns height of this tree (length of longest leaf-to-root path)
  * eg: a 1-node tree has height 1
  *****************************************************/
  public int height()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    return heightHelper(_root);
  }

  public int heightHelper(TreeNode currNode){
    TreeNode leftSubtree = currNode.getLeft();
    TreeNode rightSubtree = currNode.getRight();
    if (leftSubtree == null && rightSubtree == null){
      return 1;
    }
    if (leftSubtree == null){
      return heightHelper(rightSubtree) + 1;
    }
    if (rightSubtree == null){
      return heightHelper(leftSubtree) + 1;
    }
    if (leftSubtree != null && rightSubtree != null){
      if (heightHelper(leftSubtree) > heightHelper(rightSubtree)){
        return heightHelper(leftSubtree) + 1;
      }
      else{
        return heightHelper(rightSubtree) + 1;
      }
    }
    return 0;
  }


  /*****************************************************
  * int numLeaves()
  * returns number of leaves in tree
  *****************************************************/
  public int numLeaves()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    return numLeavesHelper(_root);
  }

  public int numLeavesHelper(TreeNode currNode){
    if (currNode.getLeft() == null && currNode.getRight() == null){
      return 1;
    }
    if (currNode.getLeft() != null && currNode.getRight() != null){
      return numLeavesHelper(currNode.getLeft()) + numLeavesHelper(currNode.getRight());
    }
    if (currNode.getLeft() == null){
      return numLeavesHelper(currNode.getRight());
    }
    if (currNode.getRight() == null){
      return numLeavesHelper(currNode.getLeft());
    }
    return 0;
  }


  //main method for testing
  public static void main( String[] args ){

      BST arbol = new BST();

      arbol.insert( 4 );
      arbol.insert( 2 );
      arbol.insert( 5 );
      arbol.insert( 6 );
      arbol.insert( 1 );
      arbol.insert( 3 );
      arbol.insert( 3 );

      System.out.println(arbol.search(2).getValue()); // 2
      System.out.println(arbol.height()); // 4
      System.out.println(arbol.numLeaves()); // 3
  }
}//end class
