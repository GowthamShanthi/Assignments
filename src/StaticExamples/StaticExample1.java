package StaticExamples;

public class StaticExample1 {

	static int a = 10; //static variable
	int b= 20; //non static variable 


	static void m1()
	{

		System.out.println("This is static method"+a);


	}


	void m2()
	{

		System.out.println("This is nopn static method"+a+b);
		
		m1(); //non static method can access evrything directly 

	}



	//static method can access static stuffs directly 
	//static method can access non static stuffs using objects 
	//non static method can access evrything directly 


	public static void main(String[] args) {
		// TODO Auto-generated method stub


		m1(); //static method can access static stuffs directly 

		StaticExample1 exmp = new StaticExample1();

		exmp.m2(); 	//static method can access non static stuffs using objects 






	}

}
