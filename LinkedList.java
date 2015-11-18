public class LinkedList<E>
{
	private ListNode<E> head;
	private ListNode<E> tail;
	private int size;
	
	public LinkedList()
	{
		head = null;
		tail = null;
		size = 0;
	}	
	
	public int size()
	{
		return size;
	}
	
	/*public int size()
	{
		int count = 0;
		for (ListNode<E> curr = head; curr != null; curr = curr.getNext())
		{
			count++;	
		}
		return count;
	}*/
	
	/*public int size()
	{
		return size(head);
	}
	
	private int size(ListNode<E> node)
	{
		if (node == null)
			return 0;
		else
			return 1 + size(node.getNext());
	}*/
	
	public boolean add(E item)
	{
		/*ListNode<E> toAdd = new ListNode<E>(item);
		if (size ==0)
		{
			tail = new ListNode<E>(null, toAdd);
			head = new ListNode<E>(null, toAdd);
		}
		else
		{
			tail.getNext().setNext(toAdd); //tail.getNext gets the last item
			tail.setNext(toAdd);
		}
		size++;
		return true;*/
		add (item, size);
		return true;
	}	
	
	public boolean add(E item, int index)
	{
		ListNode<E> toAdd = new ListNode<E>(item);
		//System.out.println(toAdd);
		int count = 0;
		if (size == 0)
		{
			head = toAdd;
			tail = toAdd;
			size++;
		}
		for (ListNode<E> curr = head; curr != null; curr = curr.getNext())
		{
			//count++;
			if (count == index-1)
			{
				toAdd.setNext(curr.getNext());
				curr.setNext(toAdd);
				size++;
				break;
			}
			count++;
		}	
		return true;
	}
	
	public E get(int i)
	{
		int count = 0;
		for (ListNode<E> curr = head; curr != null; curr = curr.getNext())
		{
			count++;
			if (count == i)
			{
				return curr.getItem();
			}
		}
		return null;
	}
	public String toString()
	{
		String output = "";
		for (ListNode<E> curr = head; curr != null; curr = curr.getNext())
		{
			output += curr.toString();
		}
		return output;
	}
	
	//Stack<Character> calculator = new LinkedList<Character>();
	
	
}
