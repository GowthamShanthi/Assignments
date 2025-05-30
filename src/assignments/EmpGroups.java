package assignments;

import java.util.ArrayList;
import java.util.List;

public class EmpGroups extends Employees{


	String [] empNames = {empname1 ,empname2,empname3   };

	int [] empIds = { empid1,empid2,empid3};


	public static void main(String[] args) {
		// TODO Auto-generated method stub


		EmpGroups emp = new EmpGroups();


		
List< String> test = new ArrayList<String>();


		System.out.println("The first  employee detail is "+emp.empNames[0]+'\t'+emp.empIds[0]);
		System.out.println("The Second employee detail is "+emp.empNames[1]+'\t'+emp.empIds[1]);
		System.out.println("The Third employee detail is "+emp.empNames[2]+'\t'+emp.empIds[2]);



	}

}


