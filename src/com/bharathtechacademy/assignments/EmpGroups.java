package com.bharathtechacademy.assignments;

public class EmpGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employees obj = new Employees();

		String[] empnames = { obj.emp1name, obj.emp2name, obj.emp3name };

		int[] empid = { obj.emp1Id, obj.emp2Id, obj.emp3Id };

		
System.out.println("The employee#1 name and id is \t "+empnames[0]+"\t"+empid[0]);
System.out.println("The employee#2 name and id is \t "+empnames[1]+"\t"+empid[1]);

System.out.println("The employee#3 name and id is \t "+empnames[2]+"\t"+empid[2]);

		
		
	}

}
