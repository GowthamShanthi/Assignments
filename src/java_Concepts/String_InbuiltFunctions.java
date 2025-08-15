package java_Concepts;

import java.util.Arrays;

public class String_InbuiltFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 = "welcome";
		
		System.out.println(s1);
		
		//FInd the length of the string
		
		System.out.println("The length of the string is "+s1.length());
		
 
		//concat() - join string  	
				
		String s2 = "to Java";
		
		String s3 = " programming";
		
		System.out.println("The concatinated string is "+s1+s2);
		
		
		String concatstring = s1.concat(s2);

System.out.println("concatstring value is "+concatstring);


System.out.println("The new concatinated string is "+concatstring.concat(s3));


System.out.println("Welcome".concat(s2)+s3);


// trim() - remove spaces from left and right of the string 

String s4 = "   Welcome   ";

System.out.println("The length of the s4 string is"+s4.length());


String  aftertrim = s4.trim();

System.out.println("The length after trim is "+aftertrim.length());

//chatrAt() - returns a character bsaed on index


String s5 = "namachivaya";

System.out.println("The character at position 3 is"+s5.charAt(2));

//contains() - retruns true or false,case sensitive too
//check a string is part of the main string or not


System.out.println(s5.contains("nama"));
System.out.println(s5.contains("om"));


//equals(), equalsIgnorecase() - compare 2 strings


String s6= "welcome";
String s7= "welcome";


System.out.println(s6.equals(s7));
System.out.println(s6.equalsIgnoreCase("WELCOME"));


//replace

String s8 = "Welcome to selenium java python python";


//replace singe char
System.out.println(s8.replace('m', '_'));



//Replace while string 
System.out.println("The sting replcement is"+s8.replace("python", "java"));


//Substring- it will extract substringfrm main string 


String s9 = "welcome ";

System.out.println("The subsstring value is"+s9.substring(2,5)); //lco

//convert case 
//touppercase 
//toowercase


System.out.println("Converting s9 to upper case"+s9.toUpperCase());
System.out.println("Converting s9 to lower case"+s9.toLowerCase());

//split() - split/divide string into multiple parts

String s10="abc@gmail.com";

String a[] = s10.split("@");

System.out.println("The splitted string is"+Arrays.toString(a)); 


//ex2 - Return only numbers no comma and $
String amount = "$15,20,55"; 

String newamount = amount.replace("$", "").replace(",", "");

System.out.println("The new amount is now"+newamount);


//ex3 -split the values in single lie

String s = "abc,123@xyz";


System.out.println(s.split(",")[0]);
System.out.println(s.split(",")[1].split("@")[0]);
System.out.println(s.split(",")[1].split("@")[1]);


//Verify contains - combination of methods
String name = "Gowtham Velumani";

System.out.println(name.toLowerCase().contains("gowtham"));

System.out.println(name.replace("G", "g").contains("gowtham"));


 










 








 














		
		
	}

}
