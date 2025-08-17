package java_Concepts;

public class ClassObjects {

	
	int eid;
	String ename;
	String job;
	int sal;
	
	
	public void display() {
		
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassObjects obj = new ClassObjects();
		
	
		obj.eid = 101;
		obj.ename = "John";
		
		obj.job = "Manager";
		obj.sal = 200000;
		
		 
		obj.display();
		
		
	
		
		ClassObjects obj1 = new ClassObjects();
		
		
		obj1.eid = 201;
		obj1.ename = "Jem";
		
		obj1.job = "Asst Manager";
	
		obj1.sal = 100000;
		
		obj1.display();
		
		
		
		
	 
		

	}

}
