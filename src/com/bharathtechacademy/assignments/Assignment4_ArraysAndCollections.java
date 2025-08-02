package com.bharathtechacademy.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.plaf.ColorUIResource;

public class Assignment4_ArraysAndCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create Lists with area of top 5 largest cities. Print the total area of the
		// 3rd and 4th cities combined.

		List<Float> citieslist = new ArrayList<>();

		citieslist.add(9999.99f);
		citieslist.add(8888.88f);
		citieslist.add(7777.77f);
		citieslist.add(6666.66f);
		citieslist.add(5555.55f);

		// Total area of 3rd and 4th ciries

		float totalarea = citieslist.get(2) + citieslist.get(3);

		System.out.println("The total area of the 3rd and 4th combines is" + totalarea);

		List<Float> ftlist = new ArrayList<Float>();

		ftlist.add(10f);

		ftlist.add(30f);

		System.out.println("The float total is " + ftlist.get(0));

//2.Create a set of the top 10 most visited tourist attractions in the world and print out allof them and its size.

		Set<String> topTenAttraction = new HashSet<>();

		topTenAttraction.add("Eiffel Tower, Paris");
		topTenAttraction.add("Great Wall of China");
		topTenAttraction.add("Taj Mahal, India");
		topTenAttraction.add("Colosseum, Rome:");
		topTenAttraction.add("Louvre Museum, Paris:");
		topTenAttraction.add("Angkor Wat, Cambodia:");
		topTenAttraction.add("Barcelona, Spain");
		topTenAttraction.add("Istanbul, Turkey:");
		topTenAttraction.add("Tokyo, Japan:");
		topTenAttraction.add("Machu Picchu, Peru:");

		System.out.println("The top most visited tourist attractions are " + topTenAttraction);

		System.out.println("The total size of the above size is " + topTenAttraction.size());
		
		
		/*3.Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and
		6th Value.
		*/
		
		int[] testarray = new int[10];
		
		testarray[0] = 10;
		testarray[1] = 20;
		testarray[2] = 30;
		testarray[3] = 40;
		testarray[4] = 50;
		testarray[5] = 60;
		testarray[6] = 70;
		testarray[7] = 80;
		testarray[8] = 90;
		testarray[9] = 100;
		
		int avg =  testarray[4] + testarray[5];
		
		System.out.println("The vaerage of 4th and 5th array value is \t"+ avg/2);
		
		
		
/*Create a list of the top 5 highest-grossing movies of all time and print out the third
movie on the list.
*/

		List<String> movieslist = new ArrayList<String>();
		movieslist.add("Avatar (2009):");
		movieslist.add("Avengers: Endgame (2019)");
		movieslist.add("Avatar: The Way of Water (2022):");
		movieslist.add("Titanic (1997):");
		movieslist.add("Star Wars: Episode VII - The Force Awakens (2015): ");
		
		
		System.out.println(movieslist.get(2));
		
		
		
		
		
		
		
	}

}
