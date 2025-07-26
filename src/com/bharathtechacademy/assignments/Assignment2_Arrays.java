package com.bharathtechacademy.assignments;

public class Assignment2_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][][] semdetails = {

				{
						// Row1 details

						{ "Mathematics I", "Physics", "Chemistry", "Computer Programming", "Engineering Drawing",
								"Basic Electrical Eng" },
						{ "Pass(78)", "Pass(85)", "Fail(21)", "Pass(74)", "Pass(88)", "Pass(79)" }

				},

				{ // Row 2 items
						{ "Mathematics II", "Mechanics", "Environmental Science", "Basic Electronics",
								"Engineering Physics", "Engineering Graphics" },
						{ "Pass(82)", "Pass(77)", "Pass(93)", "Fail(19)", "Fail(24)", "Pass(90)" } },
				{ // Row 3 items
						{ "Data Structures", "Discrete Mathematics", "Digital Electronics", "Operating Systems",
								"Signals and Systems", "Object-Oriented Prog." },
						{ "Pass(88)", "Pass(81)", "Pass(76)", "Fail(32)", "Pass(85)", "Pass(78)" } },
				{ // Row 4 items
						{ "Algorithms", "Computer Networks", "Database Systems", "Microprocessors",
								"Communication Engg", "Software Engineering" },
						{ "Pass(91)", "Pass(73)", "Fail(19)", "Pass(80)", "Pass(76)", "Pass(87)" } },
				{ // Row 5 items
						{ "Probability & Stats", "Machine Learning", "Compiler Design", "Theory of Computation",
								"Embedded Systems", "Computer Graphics" },
						{ "Pass(86)", "Pass(88)", "Pass(84)", "Pass(95)", "Pass(73)", "Pass(90)" } }

		};

		// Printing the output

		// semester 2 subject 4 name

		System.out.println("The semester 2 subject 4 name is \t " + semdetails[1][0][3]);

		// Printing semester 2 subject 5 name

		System.out.println("The semester 2 subject 5 name is \t " + semdetails[1][0][4]);

		// Printing the Status/Marks of Semester 4 Subject 3

		System.out.println("The Status/Marks of Semester 4 Subject 3 is \t" + semdetails[3][1][2]);

// Printing the Status/Marks of Semester 4 Subject 6

		System.out.println("The Status/Marks of Semester 4 Subject 3 is \t" + semdetails[3][1][5]);

	}

}