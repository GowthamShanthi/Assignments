package workouts;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Syntax to Initialize/create: 	List<DataType> variable = new LinkedList<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to remove the data:variable.remove(value);	
		//Syntax to get the data: variable.get(index);	
		//Syntax to get the total value : variable.size();	

		List<String> empNamesLinkedList = new LinkedList<String>();


		empNamesLinkedList.add("emp-one");
		empNamesLinkedList.add("emp-two");
		empNamesLinkedList.add("emp-three");
		empNamesLinkedList.add("emp-four");
		empNamesLinkedList.add("emp-five");
		empNamesLinkedList.add("emp-six");
		empNamesLinkedList.add("emp-four");
		
		empNamesLinkedList.add(5, "5th element");
		
		empNamesLinkedList.remove("emp-four");
		
		System.out.println("The total value of the list is"+empNamesLinkedList.size());
		
		 
		
		
		System.out.println("The itemsin the linked list is"+empNamesLinkedList);
		
		
	}

}
