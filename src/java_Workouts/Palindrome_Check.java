package java_Workouts;

import java.util.Scanner;

public class Palindrome_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  System.out.println("Enter the string ");
		  
		  Scanner sc = new Scanner(System.in);
		 

		String inputst = sc.nextLine();

		String revst = "";

		char[] a = inputst.toCharArray();

		System.out.println("The length of the string is" + inputst.length());

		for (int i = inputst.length() - 1; i >= 0; i--)

		{
			revst = revst + a[i];

		}

		System.out.println("The reversed string is" + revst);

		if (revst.equals(inputst)) {

			System.out.println("The user entered  string is palindrome");
		}

		else {

			System.out.println("The user entered  string is NOT palindrome");

		}

	}

}
