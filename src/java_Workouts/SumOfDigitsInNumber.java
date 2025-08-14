package java_Workouts;

import java.util.Scanner;

public class SumOfDigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		
	int 	res = 0;
	
	int addv=0;
		
	 
		
		
		while(num!=0) {
		
			
			
			res = res+num%10;
			
			
			
			num = num/10;
			
		 
			
			
		}
		
		System.out.println("The sum of entered values is"+res);

	}

}
