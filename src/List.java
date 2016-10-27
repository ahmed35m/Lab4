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
		mylist.addElement(le);
		
		System.out.format("value set to 5\n");
		System.out.println(mylist);

		System.out.println(le.getData());
		
		
		mylist.deleteElement(0);
		System.out.println(mylist);


	}
	
	
	public void addElement(ListElement le)
	{
		
		if (head == null) 
		{
			head = new ListElement();
			head = le;
		}
	ListElement tempPtr = new ListElement();
	tempPtr=le;
	
	ListElement currentPtr = head;

		
		if (currentPtr != null)
		{
			while (currentPtr.getNext() != null)
			{
				currentPtr = currentPtr.getNext();
			}
		}
		currentPtr.setNext(tempPtr);
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
	
}
