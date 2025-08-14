package java_Workouts;

public class FindNumberOfEvenAndOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int even=0;
int odd = 0;

int a[] = {1,2,3,4,5,6,7};

for(int i=0;i<=a.length-1;i++)
{
	if(a[i]%2==0) {
		
		even++;
		
	}
	
	else
	{
		
odd++;
	}
	
}


System.out.println("The number of even number is"+even);
System.out.println("The number of odd number is"+odd);

System.out.println("The array length is"+a.length);
	


int fodd = 0;
int feven = 0;


for(int x :a)
{

if(x%2!=0)
{
	
	fodd++;
}

else feven++;
}


System.out.println("using for each loop even value  is"+feven);

System.out.println("using for each loop odd value  is"+fodd);


	}
	

	
}
