import java.util.*;

public class List 
{
	private ListElement head;
	private int counter=0;
	private int data;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ListElement le = new ListElement();
		System.out.format("List added\n");

		le.setData(5);
		List mylist =new List();
		System.out.print(le.getData());
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
					if (currentPtr.getNext() == null)
					{
						currentPtr = currentPtr.getNext();
					}
				}
		currentPtr.setNext(currentPtr.getNext().getNext());
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
		//move to the last element 
		ListElement currentPtr =new ListElement();
		currentPtr=head;
		int j=counter;
		while (j>=0)
		{
			for (int i=0;i<(j-i);i++)
			{
			currentPtr=currentPtr.getNext();
			}
		
			System.out.println(currentPtr.getData()+"\n");
			currentPtr=head;
			j--;
		}

	}
		
	
	
}
