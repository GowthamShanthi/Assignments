package java_Workouts;

public class RemoveJunk_InAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		String s = "abc,123@xyz";


		System.out.println(s.split(",")[0]);
		System.out.println(s.split(",")[1].split("@")[1]);
		System.out.println(s.split(",")[1].split("@")[1]);

		
		
		String s1 = "wel&&^^%%*())*come";
		
 String[] s2 = s1.split("^");
 
 
 String s3 = "wel&&^^%%*())*come";
 
 System.out.println(s3.split("%")[0].split("&")[0]+s3.split("\\*")[2]);
 
 
 
	
 
//Method 2 
 
 String finalst = s3.replaceAll("[^a-zA-z0-9//^]", "");
 System.out.println("The final string is"+finalst);
		
		

	}

}
