package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BKnoop<E> 
{
	
  private BKnoop<E> parent, leftChild, rightChild;
  private E userObject;
  
  public static final int LEFT = 0;
  public static final int RIGHT = 1;
  
  // Constructors
  public BKnoop() 
  {
    this( null );
  }
//************************************************************************************************ 
  public BKnoop( E userObject )
  {
    parent = null;
    leftChild = null;
    rightChild = null;
    this.userObject = userObject;
  }
//************************************************************************************************ 
  // Methoden
  public void add( BKnoop<E> newChild )
  {
    if( leftChild == null ) 
      insert( newChild, LEFT );
    else
      if( rightChild == null )
        insert( newChild, RIGHT );
      else
        throw new IllegalArgumentException( 
                         "Meer dan 2 kinderen" );
  }
//************************************************************************************************ 
  public E get() 
  {
    return userObject;
  }
//************************************************************************************************ 
  public BKnoop<E> getLeftChild() 
  {
    return leftChild;
  }
//************************************************************************************************ 
  public BKnoop<E> getRightChild() 
  {
    return rightChild;
  }
//************************************************************************************************ 
  public BKnoop<E> getParent()
  {
    return parent;
  }
//************************************************************************************************ 
  public void insert( BKnoop<E> newChild, int childIndex ) 
  {
    if( isAncestor( newChild ) )
      throw new IllegalArgumentException( 
                "Nieuw kind is voorouder" );
    
    if( childIndex != LEFT &&   childIndex != RIGHT )
      throw new IllegalArgumentException(
                "Index moet 0 of 1 zijn" );

     if( newChild != null ) {
      BKnoop<E> oldParent = newChild.getParent();
      if( oldParent != null )
        oldParent.remove( newChild );
    }

    newChild.parent = this;
    if( childIndex == LEFT )
      leftChild = newChild;
    else
      rightChild = newChild;
  }
//************************************************************************************************  
  public boolean isChild( BKnoop<E> aNode ) 
  {
    return aNode == null? 
           false :
           aNode.getParent() == this;
  }
//************************************************************************************************ 
  public boolean isAncestor( BKnoop<E> aNode ) 
  {
    BKnoop<E> ancestor = this;
    while( ancestor != null && ancestor != aNode )
      ancestor = ancestor.getParent();
    return ancestor != null;
  }
//************************************************************************************************ 
  public void remove( BKnoop<E> aChild ) {
    if( aChild == null )
      throw new IllegalArgumentException(
                "Argument is null" );

    if( !isChild( aChild ) )
      throw new IllegalArgumentException(
                "Argument is geen kind" );

    if( aChild == leftChild )
    {
      leftChild.parent = null;
      leftChild = null;
    }
    else
    {
      rightChild.parent = null;
      rightChild = null;
    }
  }

//************************************************************************************************  
  public int aantalKnopen()
  {
      return 1 + (leftChild != null ? leftChild.aantalKnopen() : 0)
              + (rightChild != null ? rightChild.aantalKnopen() : 0);
  }
  
  
  
//************************************************************************************************   
  public int aantalBlad()
  {
      return (leftChild != null ? leftChild.aantalBlad() + 1 : 0)
              + (rightChild != null ? rightChild.aantalBlad() + 1 : 0);
  }

//************************************************************************************************   

  public int diepte()
  {
      return diepte(0);
  }
//************************************************************************************************  
  
  private int diepte(int diepte)
  {
      int diepteLeft = leftChild != null ? leftChild.diepte(diepte + 1) : 0;
      int diepteRight = rightChild != null ? rightChild.diepte(diepte + 1)
              : 0;

      return Math.max(diepteLeft, diepteRight);
  }
//************************************************************************************************
  
  public String inorder()
  {
      String inorder = "";

      if(this.getLeftChild() != null)
          inorder += this.getLeftChild().inorder();


      inorder += this.toString();

      if(this.getRightChild() != null)
          inorder += this.getRightChild().inorder();

      return inorder;
  }
//************************************************************************************************  
  public String preorder()
  {
      String preorder = this.toString();

      if(this.getLeftChild() != null)
          preorder += this.getLeftChild().preorder();

      if(this.getRightChild() != null)
          preorder += this.getRightChild().preorder();

      return preorder;
  }


//************************************************************************************************
  public String postorder()
  {
      String postorder = "";

      if(this.getLeftChild() != null)
          postorder += this.getLeftChild().postorder();

      if(this.getRightChild() != null)
          postorder += this.getRightChild().postorder();

      postorder += this.toString();

      return postorder;
  }
//************************************************************************************************
  public String levelorder()
  {
      ListQueue listqueue = new ListQueue();

      BKnoop<E> temp = this;

      String levelorder = "";

      while(temp != null)
      {
          levelorder = levelorder + temp.toString();

          if(temp.getLeftChild() != null)
          {
              listqueue.enqueue(temp.getLeftChild());
          }

          if(temp.getRightChild() != null)
          {
              listqueue.enqueue(temp.getRightChild());
          }

          if(listqueue.isEmpty())
          {
              temp = null;
          }
          else
          {
              temp = (BKnoop<E>) listqueue.dequeue();
          }
      }

      return levelorder;
  }	

//************************************************************************************************

//************************************************************************************************

//************************************************************************************************
	
	 public String toString()
	    {
	        return userObject.toString();
	    }
//************************************************************************************************	 
}