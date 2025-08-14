package java_Workouts;

import java.util.Arrays;

public class PrintArrayValuesinreverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int a[] = {1,2,3,4,5};
int ra[] = new int[a.length];

int j=0;

for(int i =a.length-1;i>=0;i--) {
	
	ra[j] = a[i];
	j++;
	
	
	
}

System.out.println("The reversed array is"+Arrays.toString(ra));



	}

}
