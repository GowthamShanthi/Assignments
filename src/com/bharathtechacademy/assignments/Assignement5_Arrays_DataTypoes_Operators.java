package com.bharathtechacademy.assignments;

public class Assignement5_Arrays_DataTypoes_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and
		 * marks [75, 80, 82] Add 10 marks to each students using assignment operators
		 * and store it into another array, after adding 10 marks identify the average
		 * marks of all students
		 * 
		 */

		String[] Studentnames = new String[3];
		Studentnames[0] = "Suresh";
		Studentnames[1] = "Mahesh";
		Studentnames[2] = "Naresh";

		int[] studendtmarks = new int[3];
		studendtmarks[0] = 75;
		studendtmarks[1] = 80;
		studendtmarks[2] = 83;

		int[] incrementedmarks = new int[3];

		incrementedmarks[0] = (studendtmarks[0] += 10);
		incrementedmarks[1] = (studendtmarks[1] += 10);
		incrementedmarks[2] = (studendtmarks[2] += 10);

		float average = (incrementedmarks[0] + incrementedmarks[1] + incrementedmarks[2]) / 3;

		System.out.println("The average marks fo the students is " + average);

	}

}
