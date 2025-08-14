package java_Workouts;

import java.util.Scanner;

public class DuplicatesinArray {
	
	
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		
	int search_num;

	System.out.println("Enter number to validate duplicate");
			

	Scanner sc = new Scanner(System.in);

	search_num = sc.nextInt();


	int a[] = {10,20,30,10,50};

	int  count = 0;

	for(int i=0;i<=a.length-1;i++) {
		
	if(a[i]==search_num) {
		count++;
	 

	}



		
	}


	
	System.out.println("The numebr of times the value "+search_num+ "repeated is>>" +count);

 	}
		
		

	}
	

	
