package methodsAndConstructors;

import java.util.Scanner;

public class DefaultAndParameterizedConstructor {
	
	int x,y;
	
	
	DefaultAndParameterizedConstructor(){
		
		x = 10;
		y = 30;
		
	}
	
	
	DefaultAndParameterizedConstructor(int a, int b)
	{
	
	x =a;
	y =b;
	
	
	
	}
	
	
void sum() {
	
	System.out.println(x+y);
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultAndParameterizedConstructor dp = new DefaultAndParameterizedConstructor();
		dp.sum();
		
		
		DefaultAndParameterizedConstructor dp1 = new DefaultAndParameterizedConstructor(30,40);
		
		
		dp1.sum();
		
		Scanner sc = new Scanner(System.in);
		
		sc.next();
		
		
		
		
				
		
		
		

	}

}
