import java.util.*;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.format("Program Started\n");
		ListElement le = new ListElement();
		System.out.format("List added\n");

		le.setData(5);
		System.out.format("value set to 5\n");
		System.out.println(le.getData());
		List mylist = new List();
		mylist.addElement(le);
		le.setData(50);
		mylist.addElement(le);
		mylist.printListHead();
		mylist.printListTail();
		
		
	}
	public void addElement(ListElement le)
	{
		ListElement lae = new ListElement();
	}
}
