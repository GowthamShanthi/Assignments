package java_Concepts.oops.Encapsulation;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Account acc = new Account();

		
acc.setAccno(10001);
acc.setAmount(23456);
acc.setAccname("Nama");


System.out.println("This is account number"+acc.getAccno());

System.out.println("This is account Name"+acc.getAccname());

System.out.println("This is account amount is "+acc.getAmount());

		
		
		
	}

}
