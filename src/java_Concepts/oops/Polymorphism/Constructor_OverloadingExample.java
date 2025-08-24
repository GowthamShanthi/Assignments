package java_Concepts.oops.Polymorphism;

public class Constructor_OverloadingExample {
	
int x,y =10,z=40;

	
	Constructor_OverloadingExample(){
		
		
		x=100;
		y=500;
		
		
	}
	
	

	
	Constructor_OverloadingExample(int a,int b){
		
		
		x=a;
		y-=b;
		
		
	}
	
Constructor_OverloadingExample(int a,int b,int c){
		
		
		x=a;
		y=b;
		z = c;
		
	
		
	}
	
	
	
	
public void sum() {
	
System.out.println(x+y);
	
}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Constructor_OverloadingExample exm = new Constructor_OverloadingExample();

exm.sum();


Constructor_OverloadingExample exm1 = new Constructor_OverloadingExample(20,40,30);

exm1.sum();


		
		

	}

}
