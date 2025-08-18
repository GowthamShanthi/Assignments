package methodsAndConstructors;

public class Student {
	
	
	
	 
	 
	int sid;
	String sname;
	char grade;
	
	void printStuData()
	{
		
		 
		
		System.out.println(sid+" "
		+sname+" " + grade);
		
					
	}

	
	void printStuData1()
	{
		
		 
		
		System.out.println(sname+" " + grade);
		
					
	}
	
	

	

 
	
	

	
	void setstuddata(int id, String name, char g) {
		
	System.out.println("This is from method\t"+id+" "+name+" "+g);
		
		
	}
	
	
	
//COnstrucor 1 
	
 Student (int id, String name,char g){
		
	 sid = id;
		sname = name;
		grade = g;	
		
		
		
	 
		 
	 }
 
 
 
 //COnstructor 2
 
 
 
 Student(String name,char g)
 {
	 
	 name = "Vaalgavae";
	 g = 'P';
 }
	
 
	
	void setstuddata(  String name, char g) {
		
	 
		sname = name;
		grade = g;	
		
		
	}
	
	
	//Constructor 3 
	
	Student(){
		
	}
	

}
