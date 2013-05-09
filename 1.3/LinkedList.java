//page 142

public class LinkedList<Item>
{
	private Node first;
	private Node last;
	private int size;
	
	public void insertFirst(Item item)
	{
		Node oldFirst=first;
		first=new Node();
		first.item=item;
		first.next=oldFirst;
		if(oldFirst==null)
			last=first;
		size++;
	}
	
	public Item removeFirst()
	{
		Item item=null;
		if(first!=null)
		{
			item=first.item;
			first=first.next;
		}
		if(first==null)
			last=null;
		
		size--;
		
		return item;
	}
	
	public void insertLast(Item item)
	{
		Node oldLast=last;
		last=new Node();
		last.item=item;
		if(oldLast!=null)
			oldLast.next=last;
		else
			first=last;
		size++;
	}
	
	public int size()
	{
		return size;
	}
	
	private class Node
	{
		public Item item;
		public Node next;
	}
	
	public static void main(String[] args)
	{
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.insertFirst(1);
		StdOut.println("list size "+list.size());
		list.insertFirst(2);
		StdOut.println("list size "+list.size());
		list.insertFirst(3);
		StdOut.println("list size "+list.size());
		StdOut.println("popped "+list.removeFirst());
		StdOut.println("list size "+list.size());
		StdOut.println("popped "+list.removeFirst());
		StdOut.println("list size "+list.size());
		StdOut.println("popped "+list.removeFirst());
		StdOut.println("list size "+list.size());
		list.insertLast(4);
		StdOut.println("list size "+list.size());
		list.insertLast(5);
		StdOut.println("list size "+list.size());
		list.insertLast(6);
		StdOut.println("list size "+list.size());
		list.insertFirst(7);
		StdOut.println("list size "+list.size());
		StdOut.println("popped "+list.removeFirst());
		StdOut.println("list size "+list.size());
		StdOut.println("popped "+list.removeFirst());
		StdOut.println("list size "+list.size());
		StdOut.println("popped "+list.removeFirst());
		StdOut.println("list size "+list.size());
		StdOut.println("popped "+list.removeFirst());
		StdOut.println("list size "+list.size());
	}
}