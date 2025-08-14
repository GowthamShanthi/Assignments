package java_Workouts;

import java.util.Iterator;
import java.util.Scanner;

public class CountEventAndOddFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//int a[]={1,2,3,4,5,6};

		
System.out.println("Enter the size of array");
		
int size = 0;

Scanner sc = new Scanner(System.in);

size = sc.nextInt();

int a[] = new int[size];

 for(int j=0;j<a.length;j++)
 {
	 
	 
	 System.out.println("Enter of  value a["+a[j]+"]");
	 
a[j]= sc.nextInt();

	 
 }

 
int even=0,odd =0;


for(int i=0;i<a.length;i++)
{
	
if(a[i] %2 ==0)
{
	even ++;
	
}

else 
{
odd ++;

}


}

System.out.println("The count of event number is "+even);

System.out.println("The count of event number is "+odd);

	
	}

}
