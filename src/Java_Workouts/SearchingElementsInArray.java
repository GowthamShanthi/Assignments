package java_Workouts;

import java.util.Scanner;

public class SearchingElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int search_num;

System.out.println("Enter number to search");
		

Scanner sc = new Scanner(System.in);

search_num = sc.nextInt();


int a[] = {10,20,30,40,50};

boolean status = false;

for(int i=0;i<=a.length-1;i++) {
	
if(a[i]==search_num) {
	
System.out.println("The user searched number found in the list "+a[i]);
status = true;
break;
}



	
}



if(status == false )
{
System.out.println("The number not found in the list");
}



	}

}
