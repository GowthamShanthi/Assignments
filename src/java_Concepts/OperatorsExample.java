package java_Concepts;

public class OperatorsExample {

	public static void main(String[] args) {

// Arithmetic operators +-/*%

		int a = 20, b = 10;

		System.out.println("Sum of and b is :" + (a + b));
		System.out.println("Diff of and b is :" + (a - b));
		System.out.println("Mul of and b is :" + (a * b));
		System.out.println("Div of and b is :" + (a / b));
		System.out.println("Modulo Div of and b is :" + (a % b));

//Relational operators > >= < <= != ==

//int a=20,b=10;

		System.out.println(a > b); // true
		System.out.println(a >= b); // true
		System.out.println(a < b); // false
		System.out.println(a <= b);// false
		System.out.println(a == b); // false
		System.out.println(a != b); // true

//Logical Opertors && || !

// returns boolean value - true/false
// works between2 boolen values

		boolean x = true;
		boolean y = false;

		System.out.println(x && y); // false
		System.out.println(x || y);// true
		System.out.println(!x); // false
		System.out.println(!y);// true

		boolean b1 = 10 > 20; // false

		boolean b2 = 20 > 10; // true

		System.out.println(b1);

		System.out.println(b2);

		System.out.println(b1 && b2); // false

		System.out.println(b1 || b2); // true

//Increment Operator

		// Post increment operator

		int i = 10;
		int res = i++;
		System.out.println(res); // 10 , a value is 11

		// When we assigning to another variable namach

		// pre increment

		int j = 10;
		int res1 = ++j;
		System.out.println(res1); // 11, j value is also 11 now

//Assignement operators

		// ex1

		int l = 10;

		l += 5;// increment value by 5

		l -= 5;
		System.out.println(l);
		
		
		
//Conditional / ternary operator - ?:
		
		
		//variable = exp ? result1:result2
		
		int g=200;
		int h = 100;
		
		
		
		String result = (g>h) ?"g is greater":"h is greater:";
		
		
		// if the result is true then the first part will executed
		
		//if the result is false then the secondf part will be executed 
		
		
		
		
		System.out.println(result);
		
		

		//unary operators - Operators that work on single variable  ++,--,=,+=,-=,*=./=.%=, !
		
		//Binary operators - Operators that work on min 2 variales  +,-,*,/,%,>,>=,<,<=,!=,==,&&,||.
		
		//ternary operator - ?:
		
		
		
		
		
		
		
		
		
		

	}
}
