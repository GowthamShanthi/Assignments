package java_Workouts;

import java.util.Scanner;

public class PalidromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.out.println("Enter the number");

Scanner sc = new Scanner(System.in);

int  num = sc.nextShort();

int orgnum = num;

int res = 0;
 
 
// Reverse the number first 

while(num!=0)
{
	res = res*10+num%10; //
	num = num /10;
	

	
}

System.out.println("The reversed number is "+res);


 if(orgnum == res)
 {
	 System.out.println("The entered number is palindrome");
 }
 else
 {
	 System.out.println("The entered number is NOT palindrome");
 }

	}

}
