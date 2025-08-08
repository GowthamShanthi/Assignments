package Java_Parctices;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Example1 : print 1 to 10
		/*
		 * for(int i =1;i<10;i++) {
		 * 
		 * System.out.println("This is i value now :\t"+i); }
		 * 
		 */
		
		
		
		//Break example 
		//Example 2 - Print from 1 to 10 , but stop execution when i is 6
	 
		for(int i =1;i<10;i++) {
			
			
			
		
			if(i==5)
			{
				System.out.println("Printed upto 4");
				
			break;
			}
					
			
			System.out.println("This is i value now :\t"+i);
			
			
		}

		 
		
		//Example 3 - Continue statement 
		
//		Print numbers from 1 to 10, skip the number 6 to print
		
		for(int j =1;j<10;j++) {
			
			
			
			
			if ((j==6) || (j==7))
			{
				System.out.println("SKipped number here"+j);
				
			continue;
			}
					
			
			System.out.println("This is j value now :\t"+j); }
		
		
		
			
		
		}
		
	}


