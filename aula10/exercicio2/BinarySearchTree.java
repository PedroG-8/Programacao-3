package aula10.exercicio2;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import java.lang.Comparable;

public class BinarySearchTree<T extends Comparable<? super T>> implements Iterable<T> 
{
	private static class BSTNode<T>
	{
		T element;
		BSTNode<T> left;
		BSTNode<T> right;
		
		BSTNode(T theElement)
		{
			element = theElement;
			left = right = null;
		}
		
		public BSTNode<T> subTreeMin()
		{
			return subTreeMin(this);
		}
		
		private BSTNode<T> subTreeMin(BSTNode<T> n)
		{
			if(n.left == null)
			{
				return n;
			}
			return subTreeMin(n.left);
		}
		
		public BSTNode<T> subTreeMax()
		{
			return subTreeMax(this);
		}
		
		private BSTNode<T> subTreeMax(BSTNode<T> n)
		{
			if(n.right == null)
			{
				return n;
			}
			return subTreeMax(n.right);
		}
		
	}
	private	BSTNode<T> root;
	private int numNodes;
	
	public BinarySearchTree()
	{
		root = null;
		numNodes = 0;
	}
	
	public void insert(T value)
	{
		if(!contains(value))
		{
			root = insert(value, root);
		}
	}
	
	public BSTNode<T> insert(T value, BSTNode<T> n)
	{
		if(n == null)
		{
			numNodes++;
			return new BSTNode<T>(value);
		}
		int i = value.compareTo(n.element);
		if(i < 0)
		{
			n.left = insert(value, n.left);
			return n;
		}
		else
		{
			n.right = insert(value, n.right);
			return n;
		}
	}
	
	public void remove(T value)
	{
		if(root == null)
		{
			throw new NullPointerException();
		}
		if(!contains(value))
		{
			throw new NoSuchElementException();
		}
		numNodes--;
		root = remove(value, root);
	}
	
	public BSTNode<T> remove(T value, BSTNode<T> n)
	{	
		int i = value.compareTo(n.element);
		if(i < 0)
		{
			n.left = remove(value, n.left);
		}
		else if(i > 0)
		{ 
			n.right = remove(value, n.right);
		}
		
		else if(n.left == null)
		{
			n = n.right;
		}
		else if(n.right == null)
		{
			n = n.left;
		}
		else
		{
			n = n.subTreeMin();
			remove(n.element);
		}
		return n;
	}

	public int size()
	{
		return numNodes;
	}
	public boolean contains(T value)
	{
		Iterator<T> it = iterator();
		boolean exists = false;
		while(it.hasNext())
		{
			if(((T)it.next()).equals(value))
			{
				return true;
			}
		}
		return exists;
	}
	
	public Iterator<T> iterator()
	{
		return new BSTIterator<T>(root);
	}
	
	public class BSTIterator<E> implements Iterator<E> 
	{
		Stack<BSTNode<E>> stack;
	 
		public BSTIterator(BSTNode<E> root)
		{
			stack = new Stack<BSTNode<E>>();
			while (root != null) 
			{
				stack.push(root);
				root = root.left;
			}
		}
	 
		public boolean hasNext() 
		{
			return !stack.isEmpty();
		}
	 
		public E next() 
		{
			BSTNode<E> node = stack.pop();
			E top = node.element;
			if (node.right != null) 
			{
				node = node.right;
				while (node != null) 
				{
					stack.push(node);
					node = node.left;
				}
			}
			return top;
		}
	}
}
