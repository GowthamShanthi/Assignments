package Java_Parctices;

import java.util.Scanner;

public class ConditionalStatementsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Conditional statements >> if,if else,nested if else, switch case

		// Simple if else

		int person_age = 15;

		if (person_age == 18)

		{

			System.out.println("Eligible for vote");
		}

		else

		{

			System.out.println("Not eligible for vote");
		}

// Check number is positive or negative or zero

		int num;

		System.out.println("Enter number ");
		Scanner scanner = new Scanner(System.in);

		num = scanner.nextInt();

		System.out.println("This is the received number from user" + num);
		
		
		if(num>0)
		{
			System.out.println("Number is positive");
		}
		
		else if(num<0)
		{
			System.out.println("Number is negative");
		}
		
		else 
		{
			System.out.println("Number is Zero");
		}
		

		
	int a=10,b=20,c=30;
	
	if(a>b && a>c )
	{
		System.out.println("a is largest number");
	}
	
	else if(b>a && b>c)
	{
		System.out.println("a is largest number");
		
	}
		
	
	
	// Nested if condition
	
	if(1==1)
	{
		if(2==1)
		{
			System.out.println("ABC");
			
		}
	
	}
		else 
			
		{
			
			if(3==3)
				
			{
				
				System.out.println("XYZ");
			}
		
	
	
	
}
	
	
	
	
	
	
		
	}

}
