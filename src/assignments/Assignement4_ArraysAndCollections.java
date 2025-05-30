package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignement4_ArraysAndCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*1.Create Lists with area of top 5 largest cities. 
		 * Print the total area of the 3rd and 4th cities combined.	
		 */

		String [][] Topcities = new String[][] {
			// CIties Names
			{"Chennai","Kolkata","Mumbai","Hyderabad","Bangalore"},	
			//Area
			{"100","200","300","400","500"}      

		};


		System.out.println("The top cities are  "+Topcities[0][3]+"\tAnd "+Topcities[0][4]);
		System.out.println("The  area of cities respectively "+Topcities[1][3]+"\tAnd "+Topcities[1][4]);

		
		
		
		
	/*	Create a set of the top 10 most visited tourist attractions in the world and print out all
		of them and its size. */
		
Set<String> TopTenVistiedCities = new HashSet<String>();

TopTenVistiedCities.add("Eiffel Tower");

TopTenVistiedCities.add("Colosseum");

TopTenVistiedCities.add("Sagrada Familia");


TopTenVistiedCities.add("Great Wall of China");

TopTenVistiedCities.add("Niagara Falls");


TopTenVistiedCities.add("Taj Mahal");


TopTenVistiedCities.add("Singapore");

TopTenVistiedCities.add("Dubai");

TopTenVistiedCities.add("New York");

TopTenVistiedCities.add("Niagara Falls");


System.out.println("The total cities are"+TopTenVistiedCities);

System.out.println("The size of TopTenVistiedCities is \t "+TopTenVistiedCities.size());


//--------------------------------------------

/*Create an array of 10 numbers (any 10 numbers) 
 and print out the Average of 5th and 6th Value.
 */


int [] array1 = new int[] {10,20,30,40,50,60,70,80,90,100};

int sumOftwoNumbers = array1[4] + array1[5];

   
int average = sumOftwoNumbers/2;

System.out.println("The average of the 5th and 6th value is \t"+average);


/*Create a list of the top 5 highest-grossing movies of all time and print out the third
movie on the list.

*/


List<String> TopFiveMovies = new ArrayList<String>();

TopFiveMovies.add("Avatar");
TopFiveMovies.add("Avengers: Endgame");
TopFiveMovies.add("Avatar: The Way of Water");
TopFiveMovies.add("Titanic");
TopFiveMovies.add("Avengers: Infinity War");

System.out.println("The third movie in the list is "+TopFiveMovies.get(2));





















		
	}
}


