package Java_Workouts;

import java.util.Scanner;

public class Reverse_A_Number {
	
	public static void main(String[] args) {
	
		
		//1.Without using array and inbuilt fuction
		
int rev = 0;
int num;

Scanner scanner = new Scanner(System.in);

System.out.println("Enter the number to be revrsed");
num = scanner.nextInt();



while(num!=0) 
{
	
	
	rev = rev*10+num%10;  // 
	num=num/10;
		
	
}

System.out.println(rev);
System.out.println("Now the num value is"+num);

 
System.out.println("Enter number to be reversed using inbuilt functions");
num = scanner.nextInt();


		
		

// Example 2 - Using string buffer

StringBuffer buff = new StringBuffer(String.valueOf(num));

System.out.println("The reversed value using string buffer is"+buff.reverse());



//Example 3 - Using string builder

StringBuilder bdr = new StringBuilder();

bdr.append(num);


System.out.println("The reversed value using string builder is "+bdr.reverse());

		
		
		
	}

}
