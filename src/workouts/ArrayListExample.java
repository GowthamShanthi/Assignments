package workouts;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

		// List ==> ArrayList, LinkedList
		
		// 1. List can store multiple values with similar data type together at one place by allocating memory dynamically
		// 2. List can follow dynamic memory allocation
		// 3. List allows modifications
		// 4. List allows duplicate values
		//5.Allows null value
		
		List<String> empNamesList = new ArrayList<String>() ;
		
		empNamesList.add("emp-one");
		empNamesList.add("emp-two");
		empNamesList.add("emp-three");
		empNamesList.add("emp-four");
		empNamesList.add("emp-five");
		empNamesList.add(null);
		empNamesList.add(5,"emp-six");
		empNamesList.remove(2);
		
		
		System.out.println("The items in the array list is"+empNamesList);
		
		System.out.println("The size of the array list is"+empNamesList.size());
		
		System.out.println("The fourth element in the array list is"+empNamesList.get(3));
		

	}

}
