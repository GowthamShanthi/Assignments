package java_Workouts;

import java.util.Scanner;

public class CountEvenandOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		
		
		
		int odd = 0;
		int even = 0;
		
		
		while(num!=0) {
			
		
			num = num/10;			
			
			if(num%2==0)
			{
				even++;
				
			}
			
			else 
			{
				odd++;
				
			}
			
			

			
		}
		
		
		System.out.println("The even number count is"+even);			
		System.out.println("The odd number count is"+odd);
							
		
	}
	
}
		 