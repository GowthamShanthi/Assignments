package assignments;

public class Assignment2_3DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 

		String[][][] actualvalues = new String[][][] {



			//1st row items 
			{ {"Sem 1","Subject 1","Mathematics I - Pass (78)"}, {"Sem1","Subject2","Physics - Pass(85)"},{"Sem1","Subject3","Chemistry -  Fail (21)"},{"Sem1","Subject4","Computer Programming - Pass(74)"},{"Sem1","Subject5","Eng Draw - Pass (88)"},{"Sem1","Subject6","Basic electrical eng - Pass (79)"}
			},


			//2nd row items 
			{ {"Sem 2","Subject 1","Maths 2 - Pass (82)"}, {"Sem2","Subject2","Mechanics - Pass (77)"},{"Sem2","Subject3","Environmental Science - Pass (93)"},{"Sem2","Subject4","Basic Electronic - Fail (19)"},{"Sem2","Subject5","Engeneering physics - Fail(24)"},{"Sem2","Subject6","Eng Graphics - Pass (90)"}
			},


			//3rd row items 


			{ {"Sem 3","Subject 1","Data structures - Pass (88)"}, {"Sem3","Subject2","Dicreete maths  Pass - (81)"},{"Sem3","Subject3","Digital electornics - Pass (76)"},{"Sem3	","Subject4","OS - Fail (32)"},{"Sem3","Subject5","Signals Systems - Pass(85)"},{"Sem3","Subject6","Object Oriented Programming - Pass (78)"}
			},



			//4th row items

			{ {"Sem 4","Subject 1","ALgorithms - Pass (91)"}, {"Sem4","Subject2","Computer Netwroks  Pass - (73)"},{"Sem4","Subject3","Database Systems - Fail (19)"},{"Sem4	","Subject4","Microprocessors - Pass (80)"},{"Sem4","Subject5","Communication Eng - Pass (76)"},{"Sem4","Subject6","Software engineering - Pass (87)"}
			},


			//5th row items


			{ {"Sem 5","Subject 1","Probablity and stats - Pass (86)"}, {"Sem5","Subject2","machine learning  Pass - (88)"},{"Sem5","Subject3","Compiler design  - pass (84)"},{"Sem5	","Subject4","Theory of computation - Pass (95)"},{"Sem5","Subject5","Embeded Systems - pass (73)"},{"Sem5","Subject6","Computer Graphics  - Pass (90)"}
			},



		};


		System.out.println("The Semester 2 and subject 4 mark is "+actualvalues[1][3][2]);

		System.out.println("The Semester 2 and subject 5 mark is "+actualvalues[1][4][2]);




		System.out.println("The Semester 4 and subject 3 mark is "+actualvalues[3][2][2]);

		System.out.println("The Semester 4 and subject 3 mark is "+actualvalues[3][5][2]);




	}

}







