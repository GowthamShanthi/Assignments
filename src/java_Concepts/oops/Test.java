package java_Concepts.oops;

public class Test {
	
	int num = 10;
	
	public void name() {
		
		num = num +10;	
		System.out.println(num);
		
	}
	
public void m1(int num) {
		
		num = num +10;	
		System.out.println(num);
		
		
	}


public void tester() {
	
	System.out.println("From tester method"+num);
	
}

void m2(Test t)
{
 
	t.num = t.num+10;
	System.out.println("The value of num in method is "+ num);
	
}
	 

}
