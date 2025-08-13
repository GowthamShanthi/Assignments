 package java_Workouts;

import java.util.Arrays;

public class SortElementsInArray_BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
int a[] = {23,56,23,87,45,15};


System.out.println("The array before sorting is"+Arrays.toString(a));

int n = a.length;

for(int i=0;i<a.length-1;i++)
	
{
	
for(int j=0;j<a.length-1;j++)
	
{
	
	int temp;
	
	temp = a[j];
	a[j] = a[j+1];
	a[j+1] = temp;
	
}
}



System.out.println("The array after sorting is"+Arrays.toString(a));



	}

}
