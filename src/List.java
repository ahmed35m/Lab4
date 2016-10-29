import java.util.*;

public class List 
{
	private ListElement head;
	private int counter=0;
	private int data;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ListElement le = new ListElement();
		le.setData(5);
		ListElement lf = new ListElement();
		lf.setData(6);

		List mylist =new List();
		mylist.addElement(le);
		mylist.addElement(lf);

		mylist.printLinkedListTail();
	
	}
	
	
	public void addElement(ListElement le)
	{
		ListElement tempPtr = new ListElement();
		tempPtr=le;
		if (head == null) 
		{
			//head = new ListElement();   //already declared
			head = tempPtr;
			head.setPrevious(null);
			head.setNext(null);	
		}
	
	ListElement currentPtr =head;
		
		if (currentPtr != null)
		{
			while (currentPtr.getNext() != null)
			{
				currentPtr = currentPtr.getNext();
			}
		}
		currentPtr.setNext(tempPtr);
		tempPtr.setPrevious(currentPtr);
		tempPtr.setNext(null);
		
		incrementCounter();
	}
	
	public  void incrementCounter() 
	{
		counter++;
	}	
	
	public void decrementCounter() 
	{
		counter--;
	}
	
	public void deleteElement(int index) 
	{
		ListElement currentPtr = head;
		if (head != null)
		{
			for (int i = 0; i < index; i++)
			{
				currentPtr.setNext(currentPtr.getNext());
				if (currentPtr.getNext() == null)
				{
					currentPtr = currentPtr.getPrevious();
					currentPtr.setNext(null);
				}
				else
				{
					currentPtr = currentPtr.getPrevious();
					currentPtr.setNext(currentPtr.getNext().getNext());
					currentPtr=currentPtr.getNext();
					currentPtr.setPrevious(currentPtr.getPrevious().getPrevious());
				}
			}
	currentPtr.setNext(currentPtr.getNext());
	decrementCounter();
	System.out.println("Element deleted\n");
		}
	}	
	
	public void printLinkedListHead()
	{
		/*
		 * 
		 * sortedListElement *currPtr;
	currPtr = head;
	while (currPtr != NULL)
	{
		cout << " "<< currPtr->top->datum << " ";
		currPtr = currPtr->next;
	}

		 */
		ListElement currentPtr =new ListElement();
		currentPtr=head;
		while (currentPtr!= null)
		{
			System.out.println(currentPtr.getData()+"\n");
			currentPtr=currentPtr.getNext();
		}
	}
	public void printLinkedListTail()
	{
		//implementation changed completely 
		ListElement currentPtr =new ListElement();
		currentPtr=head;
		while (currentPtr.getNext()!=null)
		{
			currentPtr.setNext(currentPtr.getNext());
		}
		while(currentPtr.getPrevious()!=null)
		{
			System.out.println(currentPtr.getData());
		}
		System.out.println(currentPtr.getData());
		
	}		
	
	
}
