package java_Concepts;

public class ThisExample {
	
	
//this keyword belongs to class variable, when class avriable and local variable is in same name then, this.variable will call the class vairable  
	
	
	
	int x = 50 , y=100;
	
	
ThisExample()
{
this.x = 90;
this.y = 80;
	
}
	
	
ThisExample(int c, int d){
	
	this.x = c;
	this.y = d;
	
	
}
	
	public void setdata(int x,int y) {
		
this.x = x;
this.y= y;
		
	}
	

	public void display() {
		
System.out.println("The x value is "+x);
		


System.out.println("The y value is "+y);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		
ThisExample exmp1 = new ThisExample();
 
exmp1.display();
		
		ThisExample exp= new ThisExample(40, 180);
			
		exp.display();
		

	}

}
