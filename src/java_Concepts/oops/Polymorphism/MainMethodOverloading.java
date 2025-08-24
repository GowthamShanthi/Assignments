package java_Concepts.oops.Polymorphism;

public class MainMethodOverloading {
	
	
	
public void main() {
	
	
	System.out.println( "This is main method - sub 1");
	
}



public void main(int a) {
	
	
	System.out.println( "This is main method - sub 2");
	
}





	public static void main(String[] args) {
		
		

		
		
		// TODO Auto-generated method stub

		
System.out.println(args.length);


MainMethodOverloading main = new MainMethodOverloading();

main.main();
main.main(10);
		

		
		
		
	}

}
