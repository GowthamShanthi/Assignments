package assignments;

public class Assignment6_Datatrypes_Arrays_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// Student Names
		String [] Studentnames = new String [] {"Suresh","Mahesh","Naresh"};


		//Student Marks 
		int [] StudentMarks = {75,80,82};

		//Incrementing student marks by 10 and storing it in another array Way #1		
		//int [] increasedMarks  = {StudentMarks[0]+10,StudentMarks[1]+10,StudentMarks[2]+10};


		//Incrementing student marks by 10 and storing it , espcially for assignment operator

		int [] increasedvalue = new int[3];

		increasedvalue[0] = StudentMarks[0]+10;
		increasedvalue[1] = StudentMarks[1]+10;
		increasedvalue[2] = StudentMarks[2]+10;


		// sum of all  values in increasedvalue array
		double sumofmarks = increasedvalue[0] +increasedvalue[1] +	increasedvalue[2];

		// Print Statements

		System.out.println("Updated Marks:");
		System.out.println("Suresh: \t"+ 	increasedvalue[0] );
		System.out.println("Mahesh: \t"+ 	increasedvalue[1] );
		System.out.println("Naresh: \t"+ 	increasedvalue[2] );



		System.out.println("Average Marks :\t"+ sumofmarks/increasedvalue.length );







	}

}
