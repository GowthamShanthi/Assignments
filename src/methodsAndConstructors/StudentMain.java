package methodsAndConstructors;

public class StudentMain {
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * //Assigning values to variables
		 * 
		 * //Approach 1 - Assigning using object
		 * 
		 * 
		 * Student std = new Student();
		 * 
		 * std.sid = 10; std.sname = "Namachivaya"; std.grade = 'A';
		 * 
		 * std.printStuData();
		 * 
		 * 
		 * //Approach 2 - Assigning using method
		 * 
		 * std.setstuddata(20, "Vaalga",'N');
		 * 
		 * std.printStuData();
		 * 
		 * std.setstuddata("Vaalgavae", 'K'); std.printStuData();
		 */

	
//Approach 3 - Using constructor 
	
 
Student std1 = new Student(90, "Namachivaya", 'A') ;
std1.printStuData();
		
std1.setstuddata(50, "Vaalga", 'D');

std1.printStuData1();




 
		
		
		
		
		
		
	}

}
