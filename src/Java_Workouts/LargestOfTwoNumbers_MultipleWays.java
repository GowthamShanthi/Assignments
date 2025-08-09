package java_Workouts;

public class LargestOfTwoNumbers_MultipleWays {
	
public static void main(String[] args) {
	
	//using if else 
	
	int a  =10,b=20;
	
	if(a>b)
	{
		System.out.println("a is the largest number:"+a);
		
	}
	
	else 
	{
		System.out.println("B is the  largest number:"+b);
		
	}
	
	
//Using ternary Operator
	
//	(a>b)? System.out.println("a is greater - using ternary operaor ");:		System.out.println("B is greater using ternary operator");
	
	 
	String result = (a>b) ? "a is greater" : "b is greater";
	
	System.out.println("The result using ternary operator is"+result);
	  
	 

	
	 
}

}
