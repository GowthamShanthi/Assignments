package java_Concepts;

import java.util.Arrays;

public class StringReverse_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String actualstring = "selenium";
		
		String rev = "";
		
		//Method 1 - length(), charAt()
		
	for(int i=actualstring.length()-1;i>=0;i--)
			
		{
		
		rev = rev + actualstring.charAt(i);
		
			
		}
	
	System.out.println("The revrsed strinfg value is"+rev);
	
	
	//Method 2- By converting string to char array
	
	String s1 ="welcome";
	
	String rev1 = "";
	
	
char a[] = s1.toCharArray();

System.out.println("The array value now is"+Arrays.toString(a));

for(int j=a.length-1;j>=0;j--)
	
{
	
	
	rev1 = rev1+a[j];
	
}

System.out.println("The reversed string is"+rev1);
		



//Method 3 - using built in methods 
//string buffer

String s4 = "welcome sir";

StringBuffer buff = new StringBuffer(s4);

System.out.println("The reverse string value is"+ buff.reverse());

//Using string builder


String s5= "Test sir";

StringBuilder bld = new StringBuilder(s5);

System.out.println(bld.reverse());





 


	}

	
	
	
	
	
	
}
