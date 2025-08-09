package java_Workouts;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		
		
		
		int count = 0;
		
		
		while(num!=0) {
			
		
			num = num/10;
			
			count++;
			
			
		}
		
		System.out.println("The number of digit inthe netered number is"+count);

	}

}
