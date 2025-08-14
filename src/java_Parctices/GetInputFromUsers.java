package java_Parctices;

import java.util.Scanner;

public class GetInputFromUsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Integer

		System.out.println("Enter a numer");

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		System.out.println("The user enetered Integer value  is" + a);
		
		
		
//Decimal Value
		
System.out.println("Enter decimal value");

double d =    sc.nextDouble();

System.out.println("The user entered double value is"+d);



//String value 

System.out.println("Enter String value");


String s = sc.next();

System.out.println("The user enetered string value is "+s);

	}

}
